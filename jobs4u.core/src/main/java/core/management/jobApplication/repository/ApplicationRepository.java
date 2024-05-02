/*package core.management.jobApplication.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
// import core.management.application.domain.Application;
import core.management.jobOpening.domain.JobReference;
// import core.management.candidate.domain.Email;

import java.util.List;

@Repository
public interface ApplicationRepository extends JpaRepository<Application, Long> {

    @Query("SELECT a FROM Application a WHERE a.candidate.email = :email")
    List<Application> findAllByCandidateEmail(@Param("email") Email email);

    @Query("SELECT a FROM Application a WHERE a.jobOpening.jobReference = :jobReference")
    List<Application> findAllByJobReference(@Param("jobReference") JobReference jobReference);

    @Query("SELECT a FROM Application a WHERE a.jobOpening.jobReference = :jobReference AND a.status = :status")
    List<Application> findAllByJobReferenceAndStatus(@Param("jobReference") JobReference jobReference, @Param("status") String status);

    @Query("SELECT a FROM Application a WHERE a.candidate.email = :email AND a.status = :status")
    List<Application> findAllByCandidateEmailAndStatus(@Param("email") Email email, @Param("status") String status);
}
*/