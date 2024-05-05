package core.management.costumer.repository;

import core.management.costumer.domain.Customer;
import core.management.costumer.domain.CustomerCode;
import eapli.framework.domain.repositories.DomainRepository;
import eapli.framework.infrastructure.authz.domain.model.SystemUser;
import eapli.framework.infrastructure.authz.domain.model.Username;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface CustomerRepository extends DomainRepository<CustomerCode, Customer> {

    List<Customer> findByRepresentatice(Username user);

    Optional<Customer> findByCustomerCode(CustomerCode customerCode);

    List<Customer> findBySystemUser(SystemUser systemUser);

}