package core.management.RequirementSpecification.repository;

import core.management.RequirementSpecification.domain.RequirementSpecification;
import eapli.framework.domain.repositories.DomainRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RequirementSpecificationRepository extends DomainRepository<String, RequirementSpecification> {

}
