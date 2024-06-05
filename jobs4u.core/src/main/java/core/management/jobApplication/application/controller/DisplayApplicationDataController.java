package core.management.jobApplication.application.controller;

import core.infrastructure.persistence.PersistenceContext;
import core.management.jobApplication.domain.jobApplication;
import core.management.jobApplication.repository.ApplicationRepository;
import core.management.jobOpening.domain.JobOpening;

public class DisplayApplicationDataController {
    private final ApplicationRepository applicationRepository = PersistenceContext.repositories().application();

    public Iterable<jobApplication> allApplications() {
        return applicationRepository.findAll();
    }
}
