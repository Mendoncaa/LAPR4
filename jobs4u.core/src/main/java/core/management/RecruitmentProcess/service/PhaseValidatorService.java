package core.management.RecruitmentProcess.service;

import core.infrastructure.persistence.PersistenceContext;
import core.management.RecruitmentProcess.domain.Phase;
import core.management.RecruitmentProcess.domain.PhaseName;
import core.management.RecruitmentProcess.domain.RecruitmentProcess;
import core.management.jobApplication.domain.NotificationStatus;
import core.management.jobApplication.domain.RequirementsEvaluation;
import core.management.jobApplication.domain.jobApplication;
import core.management.jobApplication.repository.ApplicationRepository;
import core.management.jobOpening.domain.JobReference;
import core.management.rank.domain.Rank;
import core.management.rank.domain.RankStatus;
import core.management.rank.repository.RankRepository;
import eapli.framework.application.ApplicationService;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@Component
@ApplicationService
public class PhaseValidatorService {

    private final RecruitmentProcess recruitmentProcess;
    private final ApplicationRepository applicationRepository;
    private final RankRepository rankRepository;

    public PhaseValidatorService(RecruitmentProcess recruitmentProcess) {
        this.recruitmentProcess = recruitmentProcess;
        this.applicationRepository = PersistenceContext.repositories().application();
        this.rankRepository = PersistenceContext.repositories().rank();
    }

    @Transactional
    public Iterable<String> validatePhaseTransition(JobReference jobRef) throws Exception {

        Phase currentPhase = recruitmentProcess.currentPhase();
        if (currentPhase == null) {
            return new ArrayList<>();
        }
        PhaseName currentPhaseName = currentPhase.getName();
        List<String> options = new ArrayList<>();
        try {
            if (currentPhaseName == PhaseName.ANALYSIS) {
                Rank rank = rankRepository.findByJobReference(jobRef);
                if (rank.getRankStatus() == RankStatus.FINISHED) {
                    options.add("Forward");
                }
                else if (rank.getRankStatus() == RankStatus.UNSTARTED) {
                    options.add("Backward");
                }
            }
            else
            {
                List<jobApplication> jobApplications = applicationRepository.findByJobReference(jobRef);
                int specificPhaseCount = getSpecificPhaseCount(currentPhaseName, jobApplications);

                boolean canMoveForward = validatePhaseTransitionForward(currentPhaseName, jobApplications.size(), specificPhaseCount);
                boolean canMoveBackward = validatePhaseTransitionBackward(currentPhaseName, specificPhaseCount);

                if (canMoveForward) {
                    options.add("Forward");
                }
                if (canMoveBackward) {
                    options.add("Backward");
                }
            }
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }

        return options;
    }

    private int getSpecificPhaseCount(PhaseName currentPhase, List<jobApplication> jobApplications) throws Exception {
        try {
            switch (currentPhase) {
                case SCREENING:
                    return countScreening(jobApplications);
                case INTERVIEWS:
                    return countInterviews(jobApplications);
                case RESULT:
                    return countResults(jobApplications);
                default:
                    return 0;
            }
        }
        catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }

    private int countScreening(List<jobApplication> jobApplications) {
        int count = 0;
        for (jobApplication application : jobApplications) {
            if (application.getRequirements() != null && application.getRequirements().getRequirementEvaluation() == RequirementsEvaluation.ACCEPTED) {
                count++;
            }
        }
        return count;
    }

    private int countInterviews(List<jobApplication> jobApplications) {
        int count = 0;
        for (jobApplication application : jobApplications) {
            if (application.getInterview() != null && application.getInterview().getInterviewGrade() != null && application.getInterview().getInterviewGrade().getGrade() != -1) {
                count++;
            }
        }
        return count;
    }

    private int countResults(List<jobApplication> jobApplications) {
        int count = 0;
        for (jobApplication application : jobApplications) {
            if (application.getNotificationStatus() == NotificationStatus.SEND) {
                count++;
            }
        }
        return count;
    }

    public static boolean validatePhaseTransitionForward(PhaseName currentPhase, int numberOfApplications, int specificPhaseCount) {
        switch (currentPhase) {
            case APPLICATION:
                return numberOfApplications > 0;
            case SCREENING, RESULT, INTERVIEWS:
                return numberOfApplications > 0 && specificPhaseCount == numberOfApplications;
            default:
                return false;
        }
    }

    public static boolean validatePhaseTransitionBackward(PhaseName currentPhase, int specificPhaseCount) {
        switch (currentPhase) {
            case APPLICATION:
                return false; // Can't move back from the first phase
            case SCREENING, INTERVIEWS, RESULT:
                return specificPhaseCount == 0;
            default:
                return false;
        }
    }
}
