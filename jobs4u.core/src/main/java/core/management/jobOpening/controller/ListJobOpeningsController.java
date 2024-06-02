package core.management.jobOpening.controller;

import core.infrastructure.persistence.PersistenceContext;
import core.management.jobOpening.domain.JobOpening;
import core.management.jobOpening.domain.JobReference;
import core.management.jobOpening.repository.JobOpeningRepository;
import eapli.framework.infrastructure.authz.application.AuthorizationService;
import eapli.framework.infrastructure.authz.application.AuthzRegistry;
import eapli.framework.infrastructure.authz.domain.model.Role;
import org.springframework.stereotype.Controller;

import java.util.ArrayList;
import java.util.List;

@Controller
public class ListJobOpeningsController {
    private final AuthorizationService authz = AuthzRegistry.authorizationService();

    private final JobOpeningRepository jobOpeningRepository = PersistenceContext.repositories().jobOpenings();

    public Iterable<JobOpening> allJobOpenings() {

        authz.ensureAuthenticatedUserHasAnyOf(Role.valueOf("CUSTOMER_MANAGER"), Role.valueOf("ADMIN"));

        return jobOpeningRepository.findAll();
    }

    public List<JobReference> allJobReferences() {
        return jobOpeningRepository.findAllJobReferences();
    }
}
