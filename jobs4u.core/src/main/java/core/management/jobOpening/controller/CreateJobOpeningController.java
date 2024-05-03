package core.management.jobOpening.controller;

import core.management.jobOpening.domain.*;
import eapli.framework.general.domain.model.Description;
import eapli.framework.infrastructure.authz.application.AuthorizationService;
import eapli.framework.infrastructure.authz.application.AuthzRegistry;
import eapli.framework.infrastructure.authz.domain.model.Role;

public class CreateJobOpeningController {
    private final AuthorizationService authz = AuthzRegistry.authorizationService();

    public void createJobOpening(String jobReference, String jobTitle, ContractType contractType, JobMode jobMode, String description, String street, int doorNumber, String floor, String postalCode, int numberOfVacancies) {
        authz.ensureAuthenticatedUserHasAnyOf(Role.valueOf("CUSTOMER_MANAGER"));

        // Convert and validate inputs
        JobReference ref = new JobReference(jobReference);
        JobTitle title = JobTitle.valueOf(jobTitle);
        Description desc = Description.valueOf(description);
        Address addr = Address.valueOf(street, doorNumber, floor, postalCode);
        NumberOfVacancies vacancies = new NumberOfVacancies(numberOfVacancies);

        // Here you would call your domain services or repository methods to actually create the JobOpening and persist it.
        // Example: jobOpeningRepository.add(new JobOpening(ref, title, getCurrentJobState(), contractType, jobMode, desc, addr, vacancies));
    }
}
