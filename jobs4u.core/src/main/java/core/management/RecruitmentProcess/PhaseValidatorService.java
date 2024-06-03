package core.management.RecruitmentProcess;

import core.infrastructure.persistence.PersistenceContext;
import core.management.RecruitmentProcess.domain.RecruitmentProcess;
import core.management.jobApplication.repository.ApplicationRepository;
import core.management.jobOpening.domain.JobReference;
import core.management.rank.domain.Rank;
import core.management.rank.repository.RankRepository;
import lombok.Getter;

import java.util.List;

public class PhaseValidatorService {

    @Getter
    private RecruitmentProcess recruitmentProcess;
    private ApplicationRepository applicationRepository;
    private RankRepository rankRepository;

    public PhaseValidatorService(RecruitmentProcess recruitmentProcess) {
        this.recruitmentProcess = recruitmentProcess;
        applicationRepository = PersistenceContext.repositories().application();
        rankRepository = PersistenceContext.repositories().rank();
    }

    public Iterable<String> validatePhaseTransition(String jobReference) {
        Rank rank = rankRepository.findByJobReference(new JobReference(jobReference));
        int numberOfApplications = applicationRepository.countApplicationsByJobReference(jobReference);
        int numberOfApplicationsScreening = applicationRepository.countScreeningByJobReference(jobReference);
        int numberOfApplicationsInterviews = applicationRepository.countInterviewsByJobReference(jobReference);
        int numberOfApplicationsResults = applicationRepository.countResultsByJobReference(jobReference);

        validatePhaseTransitionForward();
        validatePhaseTransitionBackward();

        // Return options as an example
        return List.of("Forward", "Backward");
    }

    private void validatePhaseTransitionForward() {
        // Validation logic for forward transition
    }

    private void validatePhaseTransitionBackward() {
        // Validation logic for backward transition
    }

}

