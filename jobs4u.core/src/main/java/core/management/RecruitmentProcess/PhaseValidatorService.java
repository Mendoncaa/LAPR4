package core.management.RecruitmentProcess;

import core.infrastructure.persistence.PersistenceContext;
import core.management.RecruitmentProcess.domain.RecruitmentProcess;
import core.management.jobApplication.repository.ApplicationRepository;
import core.management.jobOpening.domain.JobReference;
import core.management.jobOpening.repository.JobOpeningRepository;
import core.management.rank.domain.Rank;
import core.management.rank.repository.RankRepository;
import eapli.framework.domain.services.DomainService;
import org.springframework.stereotype.Component;

import java.util.List;

@DomainService
@Component
public class PhaseValidatorService {

    private RecruitmentProcess recruitmentProcess;
    private ApplicationRepository applicationRepository;
    private RankRepository rankRepository;
    private JobOpeningRepository jobOpeningRepository;

    public PhaseValidatorService(RecruitmentProcess recruitmentProcess) {
        this.recruitmentProcess = recruitmentProcess;
        applicationRepository = PersistenceContext.repositories().application();
        rankRepository = PersistenceContext.repositories().rank();
        jobOpeningRepository = PersistenceContext.repositories().jobOpenings();
    }

    public Iterable<String> validatePhaseTransition(String jobReference) {
        Rank rank = jobOpeningRepository.findRankByJobReference(new JobReference(jobReference));
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

