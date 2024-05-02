/*package core.management.jobApplication.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import sem4pi.core.management.candidate.domain.Candidate;
import sem4pi.core.management.candidate.domain.Email;

@Repository
public interface CandidateRepository extends JpaRepository<Candidate, Long> {

    @Query("SELECT c FROM Candidate c WHERE c.email = :email")
    Candidate findByEmail(@Param("email") Email email);

    default boolean existsByEmail(Email email) {
        return findByEmail(email) != null;
    }

    @Query("SELECT c FROM Candidate c")
    List<Candidate> findAll();

    @Query("SELECT c FROM Candidate c WHERE c.name = :name")
    List<Candidate> findAllByName(@Param("name") String name);
}
*/