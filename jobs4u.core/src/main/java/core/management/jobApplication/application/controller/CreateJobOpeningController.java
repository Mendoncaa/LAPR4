package core.management.jobApplication.application.controller;

import core.management.jobOpening.domain.*;
import eapli.framework.general.domain.model.Description;
import eapli.framework.infrastructure.authz.application.AuthorizationService;
import eapli.framework.infrastructure.authz.application.AuthzRegistry;
import eapli.framework.infrastructure.authz.domain.model.Role;

public class CreateJobOpeningController {
    private final AuthorizationService authz = AuthzRegistry.authorizationService();

    public void createJobOpening(JobReference jobReference, JobTitle jobTitle, ContractType contractType, JobMode jobMode, Description description, Address address, NumberOfVacancies numberOfVacancies) {
        authz.ensureAuthenticatedUserHasAnyOf(Role.valueOf("HR_MANAGER")); // Assuming HR_MANAGER is a role defined for managing HR related activities
        // Here you would call your domain services or repository methods to actually create the JobOpening and persist it.
    }
}
