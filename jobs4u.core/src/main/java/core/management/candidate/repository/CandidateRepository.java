package core.management.candidate.repository;

import core.management.candidate.domain.Candidate;
import core.management.candidate.domain.CandidateEmail;
import core.management.candidate.domain.CandidateName;
import eapli.framework.domain.repositories.DomainRepository;
import eapli.framework.infrastructure.authz.domain.model.Username;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface CandidateRepository extends DomainRepository<CandidateEmail, Candidate> {

    List<Candidate> findByName(CandidateName user);

    Optional<Candidate> findByCandidateEmail(CandidateEmail email);


}