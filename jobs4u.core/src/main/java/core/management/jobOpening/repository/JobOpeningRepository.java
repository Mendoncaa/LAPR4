package core.management.jobOpening.repository;

import core.management.rank.domain.Rank;
import eapli.framework.domain.repositories.DomainRepository;
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

    List<JobReference> findAllJobReferences();

    int nextJobNumber(String customerCode);

    Rank findRankByJobReference(JobReference jobReference);

    String getInterviewFilePath(JobReference jobReference);

    String getRequirementFilePath(JobReference jobReference);

}