package core.management.jobOpening.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import core.management.jobOpening.domain.JobState;
import core.management.jobOpening.domain.JobReference;
import java.util.List;
import core.management.jobOpening.domain.JobOpening;

@Repository
public interface JobOpeningRepository extends JpaRepository<JobOpening, Long> {

    @Query("SELECT j from JobOpening j where j.jobState = :jobState")
    List<JobOpening> findAllByState(@Param("state") JobState jobState);

    @Query("SELECT j from JobOpening j where j.jobReference = :jobReference")
    JobOpening findByJobReference(@Param("jobReference") JobReference jobReference);

    default boolean existsByJobReference(JobReference jobReference) {
        return findByJobReference(jobReference) != null;
    }
}