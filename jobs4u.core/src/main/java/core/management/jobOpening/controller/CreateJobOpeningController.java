package core.management.jobOpening.controller;

import core.infrastructure.persistence.PersistenceContext;
import core.management.costumer.domain.Customer;
import core.management.costumer.repository.CustomerRepository;
import core.management.jobOpening.domain.*;
import core.management.jobOpening.repository.JobOpeningRepository;
import core.management.user.domain.ExemploRoles;
import eapli.framework.general.domain.model.Description;
import eapli.framework.infrastructure.authz.application.AuthorizationService;
import eapli.framework.infrastructure.authz.application.AuthzRegistry;
import eapli.framework.infrastructure.authz.domain.model.SystemUser;

import java.util.List;
import java.util.Optional;

public class CreateJobOpeningController {
    private final AuthorizationService authz = AuthzRegistry.authorizationService();

    private final CustomerRepository customerRepository = PersistenceContext.repositories().customer();

    private final JobOpeningRepository jobOpeningRepository = PersistenceContext.repositories().jobOpenings();

    public void createJobOpening(String customerCode, String jobTitle, ContractType contractType, JobMode jobMode, String description, String street, int doorNumber, String floor, String postalCode, int numberOfVacancies) {

        //TODO
        // Criar JobReference com o CustomerCode
        // exemplo: int jobNumber = jobOpeningRepository.nextJobNumber(customerCode);

        int jobNumber = 1;
        JobReference ref = new JobReference(customerCode, jobNumber);
        JobTitle title = JobTitle.valueOf(jobTitle);
        Description desc = Description.valueOf(description);
        Address addr = Address.valueOf(street, doorNumber, floor, postalCode);
        NumberOfVacancies vacancies = new NumberOfVacancies(numberOfVacancies);

        jobOpeningRepository.save(new JobOpening(ref, title, JobState.CLOSED, contractType, jobMode, desc, addr, vacancies));

    }
    public List<Customer> findCustomerByCustomerManager()
    {
        Optional<SystemUser> user = authz.loggedinUserWithPermissions(ExemploRoles.CUSTOMER_MANAGER);
        return customerRepository.findBySystemUser(user.get());
    }
}
