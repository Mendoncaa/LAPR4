package core.management.jobApplication.repository;

import core.management.jobApplication.domain.Application;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ApplicationRepository extends JpaRepository<Application, Long> {
    // Buscar aplicações por status
    List<Application> findByStatus(String status);

    // Buscar aplicações relacionadas a um certo JobOpening
    List<Application> findByJobOpening_Id(Long jobOpeningId);

    // Buscar aplicações por Email do Candidato (supondo que Email seja um campo único em Candidate)
    List<Application> findByCandidate_Email(String email);
}
