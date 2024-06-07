package core.management.RecruitmentProcess.service;

import core.infrastructure.persistence.PersistenceContext;
import core.management.RecruitmentProcess.domain.PhaseName;
import core.management.RecruitmentProcess.domain.RecruitmentProcess;
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
        PhaseName currentPhase = recruitmentProcess.currentPhase().getName();
        List<String> options = new ArrayList<>();
        try {
            switch (currentPhase) {
                case ANALYSIS:
                    Rank rank = rankRepository.findByJobReference(jobRef);
                    if (rank.getRankStatus() == RankStatus.FINISHED) {
                        options.add("Forward");
                    }
                    else if (rank.getRankStatus() == RankStatus.UNSTARTED) {
                        options.add("Backward");
                    }
                    break;
                default:
                    int numberOfApplications = applicationRepository.countApplicationsByJobReference(jobRef);
                    int specificPhaseCount = getSpecificPhaseCount(currentPhase, jobRef);

                    boolean canMoveForward = validatePhaseTransitionForward(currentPhase, numberOfApplications, specificPhaseCount);
                    boolean canMoveBackward = validatePhaseTransitionBackward(currentPhase, specificPhaseCount);

                    if (canMoveForward) {
                        options.add("Forward");
                    }
                    if (canMoveBackward) {
                        options.add("Backward");
                    }
                    break;
            }
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }

        return options;
    }

    private int getSpecificPhaseCount(PhaseName currentPhase, JobReference jobReference) throws Exception {
        try {
            switch (currentPhase) {
                case SCREENING:
                    return applicationRepository.countScreeningByJobReference(jobReference);
                case INTERVIEWS:
                    return applicationRepository.countInterviewsByJobReference(jobReference);
                case RESULT:
                    return applicationRepository.countResultsByJobReference(jobReference);
                default:
                    return 0;
            }
        }
        catch (Exception e) {
            throw new Exception(e.getMessage());
        }
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
