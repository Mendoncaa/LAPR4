package core.management.costumer.repository;


import core.management.costumer.domain.CustomerRepresentative;
import core.management.costumer.domain.PhoneNumber;
import eapli.framework.domain.repositories.DomainRepository;
import eapli.framework.infrastructure.authz.domain.model.Username;
import org.springframework.stereotype.Repository;
import java.util.Optional;

@Repository
public interface CustomerRepresentativeRepository extends DomainRepository<PhoneNumber, CustomerRepresentative> {

    Optional<CustomerRepresentative> findByUsername(Username name);

    default Optional<CustomerRepresentative> findByPhoneNumber(final PhoneNumber phoneNumber) {
        return ofIdentity(phoneNumber);
    }

    public Iterable<CustomerRepresentative> findAllActive();

   

}