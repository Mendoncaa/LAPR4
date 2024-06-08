package core.management.InterviewModel.repository;

import core.management.InterviewModel.domain.InterviewModel;
import eapli.framework.domain.repositories.DomainRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InterviewModelRepository extends DomainRepository<String, InterviewModel> {

}
