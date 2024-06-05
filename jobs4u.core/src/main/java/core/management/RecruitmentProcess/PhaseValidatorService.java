package core.management.RecruitmentProcess;

import core.infrastructure.persistence.PersistenceContext;
import core.management.RecruitmentProcess.domain.PhaseName;
import core.management.RecruitmentProcess.domain.RecruitmentProcess;
import core.management.jobApplication.repository.ApplicationRepository;
import core.management.jobOpening.domain.JobReference;
import core.management.rank.domain.Rank;
import core.management.rank.repository.RankRepository;
import eapli.framework.domain.services.DomainService;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@DomainService
@Component
public class PhaseValidatorService {

    private final RecruitmentProcess recruitmentProcess;
    private final ApplicationRepository applicationRepository;
    private final RankRepository rankRepository;

    public PhaseValidatorService(RecruitmentProcess recruitmentProcess) {
        this.recruitmentProcess = recruitmentProcess;
        this.applicationRepository = PersistenceContext.repositories().application();
        this.rankRepository = PersistenceContext.repositories().rank();
    }

    public Iterable<String> validatePhaseTransition(String jobReference) {
        JobReference jobRef = new JobReference(jobReference);
        PhaseName currentPhase = recruitmentProcess.currentPhase().getName();
        List<String> options = new ArrayList<>();

        switch (currentPhase) {
            case ANALYSIS:
                Rank rank = rankRepository.findByJobReference(jobRef);
                if (rank == null) {
                    options.add("Backward");
                } else {
                    options.add("Forward");
                }
                break;
            default:
                int numberOfApplications = applicationRepository.countApplicationsByJobReference(jobRef);
                int specificPhaseCount = getSpecificPhaseCount(currentPhase, jobRef);

                boolean canMoveForward = validatePhaseTransitionForward(currentPhase, numberOfApplications, specificPhaseCount);
                boolean canMoveBackward = validatePhaseTransitionBackward(currentPhase, numberOfApplications, specificPhaseCount);

                if (canMoveForward) {
                    options.add("Forward");
                }
                if (canMoveBackward) {
                    options.add("Backward");
                }
                break;
        }
        return options;
    }

    private int getSpecificPhaseCount(PhaseName currentPhase, JobReference jobReference) {
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

    private boolean validatePhaseTransitionForward(PhaseName currentPhase, int numberOfApplications, int specificPhaseCount) {
        switch (currentPhase) {
            case APPLICATION:
                return numberOfApplications > 0;
            case SCREENING, RESULT, INTERVIEWS:
                return specificPhaseCount == numberOfApplications;
            default:
                return false;
        }
    }

    private boolean validatePhaseTransitionBackward(PhaseName currentPhase, int numberOfApplications, int specificPhaseCount) {
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
