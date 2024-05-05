package jobs4u.persistence.impl.jpa;

import core.management.costumer.domain.Customer;
import core.management.costumer.domain.CustomerCode;
import core.management.costumer.repository.CustomerRepository;
import eapli.framework.domain.repositories.TransactionalContext;
import eapli.framework.infrastructure.authz.domain.model.SystemUser;
import eapli.framework.infrastructure.authz.domain.model.Username;
import eapli.framework.infrastructure.repositories.impl.jpa.JpaAutoTxRepository;
import jobs4u.Application;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import java.util.List;

class JpaCustomerRepository extends JpaAutoTxRepository<Customer, CustomerCode, CustomerCode>
        implements CustomerRepository {

    public JpaCustomerRepository(final TransactionalContext autoTx) {
        super(autoTx, "customerCode");
    }

    public JpaCustomerRepository(final String puname) {
        super(puname, Application.settings().getExtendedPersistenceProperties(), "customerCode");
    }

    @Override
    public List<Customer> findByRepresentatice(final Username user) {
        final Map<String, Object> params = new HashMap<>();
        params.put("user", user);
        return match("e.representative=:user", params);
    }

    @Override
    public Optional<Customer> findByCustomerCode(final CustomerCode code) {
        final Map<String, Object> params = new HashMap<>();
        params.put("code", code);
        return matchOne("e.customerCode=:code", params);
    }

    @Override
    public List<Customer> findBySystemUser(final SystemUser systemUser) {
        final Map<String, Object> params = new HashMap<>();
        params.put("systemUser", systemUser);
        return match("e.systemUser=:systemUser", params);
    }
}