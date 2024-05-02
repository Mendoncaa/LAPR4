package core.management.jobApplication.application.controller;

import core.management.jobOpening.domain.JobOpening;
import eapli.framework.infrastructure.authz.application.AuthorizationService;
import eapli.framework.infrastructure.authz.application.AuthzRegistry;
import eapli.framework.infrastructure.authz.domain.model.Role;
import java.util.ArrayList;
import java.util.List;

public class ListJobOpeningsController {
    private final AuthorizationService authz = AuthzRegistry.authorizationService();

    public Iterable<JobOpening> allJobOpenings() {
        authz.ensureAuthenticatedUserHasAnyOf(Role.valueOf("HR_VIEWER"), Role.valueOf("HR_MANAGER")); // Assuming HR_VIEWER and HR_MANAGER are roles with permissions to view job openings
        // Mock implementation. Replace with actual data fetching logic, e.g., from a repository.
        List<JobOpening> jobOpenings = new ArrayList<>();
        // jobOpenings = repository.findAll(); // Uncomment and implement repository call
        return jobOpenings;
    }
}
