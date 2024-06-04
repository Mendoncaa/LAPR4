package core.management.candidate.repository;

import core.management.candidate.domain.Candidate;
import eapli.framework.domain.repositories.DomainRepository;
import eapli.framework.general.domain.model.EmailAddress;
import eapli.framework.infrastructure.authz.domain.model.Name;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface CandidateRepository extends DomainRepository<EmailAddress, Candidate> {

    Optional<Candidate> findByName(Name user);

    Optional<Candidate> findByCandidateEmail(EmailAddress email);


}