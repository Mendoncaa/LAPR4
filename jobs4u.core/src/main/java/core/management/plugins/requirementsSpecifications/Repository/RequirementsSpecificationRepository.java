package core.management.plugins.requirementsSpecifications.Repository;

import core.management.plugins.SpecName;
import core.management.plugins.requirementsSpecifications.domain.RequirementsSpecification;
import eapli.framework.domain.repositories.DomainRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RequirementsSpecificationRepository  extends DomainRepository<SpecName, RequirementsSpecification>
{
}
