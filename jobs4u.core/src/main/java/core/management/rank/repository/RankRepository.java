package core.management.rank.repository;

import core.management.jobOpening.domain.JobOpening;
import core.management.jobOpening.domain.JobReference;
import core.management.rank.domain.Rank;
import eapli.framework.domain.repositories.DomainRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RankRepository extends DomainRepository<Long, Rank> {

    Rank findByJobReference(JobReference jobReference);
}
