package core.management.jobApplication.domain;

import core.management.candidate.domain.Candidate;
import core.management.jobOpening.domain.JobOpening;
import eapli.framework.domain.model.AggregateRoot;

import jakarta.persistence.*;
import lombok.Getter;

@Entity
@Getter
@Table(name = "applications") // Define o nome da tabela explicitamente
public class jobApplication implements AggregateRoot<Long> {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "candidate_id", nullable = false)
    private Candidate candidate;

    @ManyToOne
    @JoinColumns({
            @JoinColumn(name = "job_reference_customerCode", nullable = false),
            @JoinColumn(name = "job_reference_jobNumber", nullable = false)
    })
    private JobOpening jobOpening;

    @Column(nullable = false)
    private String status; // O status da aplicação

    // Construtor com argumentos essenciais
    public jobApplication(Candidate candidate, JobOpening jobOpening) {
        this.candidate = candidate;
        this.jobOpening = jobOpening;
        this.status = "Pending"; // O status inicial é sempre "Pendente"
    }

    // Construtor protegido para JPA
    protected jobApplication() {
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
        if (!(other instanceof jobApplication that)) return false;
        return this.id != null && this.id.equals(that.id);
    }

    @Override
    public Long identity() {
        return this.id;
    }
}
