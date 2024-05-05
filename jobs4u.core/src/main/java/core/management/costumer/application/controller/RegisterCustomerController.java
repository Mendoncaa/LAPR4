package core.management.costumer.application.controller;

import core.management.costumer.domain.Customer;
import core.management.costumer.domain.CustomerCode;
import core.management.costumer.domain.CustomerRepresentative;
import core.management.costumer.domain.PhoneNumber;
import core.management.costumer.builder.CustomerBuilder;
import core.management.costumer.repository.CustomerRepresentativeRepository;
import core.management.user.application.AddUserController;
import core.management.user.domain.ExemploRoles;
import eapli.framework.infrastructure.authz.domain.model.Role;
import eapli.framework.infrastructure.authz.domain.model.SystemUser;
import eapli.framework.infrastructure.authz.application.AuthorizationService;
import eapli.framework.infrastructure.authz.application.AuthzRegistry;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import java.util.Set;

@Controller
public class RegisterCustomerController {

    private final AddUserController addUserController = new AddUserController();

    private final CustomerRepresentativeRepository customerRepresentativeRepository;
   
    private final AuthorizationService authz = AuthzRegistry.authorizationService();
    private final CustomerBuilder customerBuilder;

    @Autowired
    public RegisterCustomerController(CustomerRepresentativeRepository customerRepresentativeRepository, CustomerBuilder customerBuilder) {
        this.customerRepresentativeRepository = customerRepresentativeRepository;
        this.customerBuilder = customerBuilder;
        
    }

    public SystemUser getLoggedInUser() {
        return authz.session().get().authenticatedUser();
    }

    public CustomerRepresentative registerCustomer(String username, String pwd, String firstName, String lastName, String email, CustomerCode customerCode, PhoneNumber phoneNumber, SystemUser customerManager) {
        Set<Role> roles = Set.of(ExemploRoles.CUSTOMER);
        SystemUser systemUser = addUserController.addUser(username, pwd, firstName, lastName, email, roles);

        if (systemUser == null) {
            throw new IllegalStateException("Failed to register system user");
        }

        CustomerBuilder builder = new CustomerBuilder();
        builder.withSystemUser(systemUser)
               .withCompany(customerCode)
               .withPhoneNumber(phoneNumber)
               .withCustomManager(customerManager);

        CustomerRepresentative newCustomer = builder.build();
        return customerRepresentativeRepository.save(newCustomer);
    }
}
