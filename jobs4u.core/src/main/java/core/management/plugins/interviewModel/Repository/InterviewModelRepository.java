package core.management.plugins.interviewModel.Repository;

import core.management.jobOpening.domain.JobOpening;
import core.management.jobOpening.domain.JobReference;
import core.management.plugins.SpecName;
import core.management.plugins.interviewModel.domain.InterviewModel;
import eapli.framework.domain.repositories.DomainRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InterviewModelRepository extends DomainRepository<SpecName, InterviewModel>
{

}