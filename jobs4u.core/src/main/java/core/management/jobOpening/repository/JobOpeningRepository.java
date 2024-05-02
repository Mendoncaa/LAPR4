package core.management.jobOpening.repository;

import core.utentemanagement.domain.MecanographicNumber;
import core.utentemanagement.domain.Utente;
import eapli.framework.domain.repositories.DomainRepository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import core.management.jobOpening.domain.JobState;
import core.management.jobOpening.domain.JobReference;
import java.util.List;
import java.util.Optional;

import core.management.jobOpening.domain.JobOpening;

@Repository
public interface JobOpeningRepository extends DomainRepository<JobReference, JobOpening> {

    List<JobOpening> findAllByState(JobState jobState);

    Optional<JobOpening> findByJobReference(JobReference jobReference);


}