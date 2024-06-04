package core.management.jobApplication.application.controller;

import core.infrastructure.persistence.PersistenceContext;
import core.management.candidate.domain.Candidate;
import core.management.candidate.repository.CandidateRepository;
import core.management.jobApplication.domain.jobApplication;
import core.management.jobApplication.repository.ApplicationRepository;
import core.management.jobOpening.domain.JobOpening;
import eapli.framework.infrastructure.authz.application.AuthorizationService;
import eapli.framework.infrastructure.authz.application.AuthzRegistry;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
public class ListApplicationsForJobOpeningController {

    private final ApplicationRepository applicationRepository = PersistenceContext.repositories().application();
    private final AuthorizationService authz = AuthzRegistry.authorizationService();
    private final CandidateRepository candidateRepository = PersistenceContext.repositories().candidate();

    public Iterable<jobApplication> applicationsForJob(JobOpening jobOpening) {

        return applicationRepository.findApplicationsByJobOpening(jobOpening);
    }

    public List<jobApplication> listAllMyApplications() {
        Candidate candidate = candidateRepository.findByName(authz.session().get().authenticatedUser().name()).get();
        return applicationRepository.findApplicationsByCandidate(candidate);
    }

    public int getNumberOfApplicants(JobOpening jobOpening) {
        return applicationRepository.findApplicationsByJobOpening(jobOpening).size();
    }
}
