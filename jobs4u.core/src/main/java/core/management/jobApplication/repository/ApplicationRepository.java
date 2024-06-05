package core.management.jobApplication.repository;

import core.management.candidate.domain.Candidate;
import core.management.jobApplication.domain.jobApplication;
import core.management.jobOpening.domain.JobOpening;
import core.management.jobOpening.domain.JobReference;
import eapli.framework.domain.repositories.DomainRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface ApplicationRepository extends DomainRepository<Long, jobApplication> {
    List<jobApplication> findAllByStatus(String status);

    List<jobApplication> findApplicationsByJobOpening(JobOpening jobOpening);

    List<jobApplication> findApplicationsByCandidate(Candidate candidate);

    Optional<List<jobApplication>> findbyJobReference(JobReference jobReference);

    int countApplicationsByJobReference(JobReference jobReference);

    int countScreeningByJobReference(JobReference jobReference);

    int countInterviewsByJobReference(JobReference jobReference);

    int countResultsByJobReference(JobReference jobReference);
}
