package core.management.jobApplication.domain;

import core.management.candidate.domain.Candidate;
import core.management.jobOpening.domain.JobOpening;
import eapli.framework.domain.model.AggregateRoot;

import jakarta.persistence.*;

@Entity
@Table(name = "applications") // Define o nome da tabela explicitamente
public class Application implements AggregateRoot<Long> {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "candidate_id", nullable = false)
    private Candidate candidate;

    @ManyToOne
    @JoinColumn(name = "job_opening_id", nullable = false)
    private JobOpening jobOpening;

    @Column(nullable = false)
    private String status; // O status da aplicação

    // Construtor com argumentos essenciais
    public Application(Candidate candidate, JobOpening jobOpening) {
        this.candidate = candidate;
        this.jobOpening = jobOpening;
        this.status = "Pending"; // O status inicial é sempre "Pendente"
    }

    // Construtor protegido para JPA
    protected Application() {
    }

    public void approve() {
        this.status = "Approved";
    }

    public void reject() {
        this.status = "Rejected";
    }

    @Override
    public boolean sameAs(Object other) {
        if (this == other) return true;
        if (!(other instanceof Application that)) return false;
        return this.id != null && this.id.equals(that.id);
    }

    @Override
    public Long identity() {
        return this.id;
    }
}
