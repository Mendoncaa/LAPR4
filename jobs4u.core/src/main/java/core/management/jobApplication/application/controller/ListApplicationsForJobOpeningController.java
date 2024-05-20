package core.management.jobApplication.application.controller;

import core.infrastructure.persistence.PersistenceContext;
import core.management.jobApplication.domain.jobApplication;
import core.management.jobApplication.repository.ApplicationRepository;
import core.management.jobOpening.domain.JobOpening;
import org.springframework.stereotype.Controller;

@Controller
public class ListApplicationsForJobOpeningController {

    private final ApplicationRepository applicationRepository = PersistenceContext.repositories().application();

    public Iterable<jobApplication> applicationsForJob(JobOpening jobOpening) {

        return applicationRepository.findApplicationsByJobOpening(jobOpening);
    }
}
