package core.management.jobOpening.controller;

import core.management.jobOpening.domain.JobOpening;
import eapli.framework.infrastructure.authz.application.AuthorizationService;
import eapli.framework.infrastructure.authz.application.AuthzRegistry;
import eapli.framework.infrastructure.authz.domain.model.Role;
import java.util.ArrayList;
import java.util.List;

public class ListJobOpeningsController {
    private final AuthorizationService authz = AuthzRegistry.authorizationService();

    public Iterable<JobOpening> allJobOpenings() {
        authz.ensureAuthenticatedUserHasAnyOf(Role.valueOf("CUSTOMER_MANAGER"), Role.valueOf("ADMIN"));
        List<JobOpening> jobOpenings = new ArrayList<>();
        return jobOpenings;
    }
}
