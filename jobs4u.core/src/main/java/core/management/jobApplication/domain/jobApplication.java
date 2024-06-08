package core.management.jobApplication.domain;

import core.management.candidate.domain.Candidate;
import core.management.jobOpening.domain.JobOpening;
import eapli.framework.domain.model.AggregateRoot;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
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

    private String requirementAnswersPath; // As respostas do candidato às questões de requisitos

    private boolean requirementEvaluation; // A avaliação dos requisitos

    private String interviewAnswersPath; // As notas da entrevista

    private int interviewGrades; // A classificação da entrevista

    // Construtor com argumentos essenciais
    public jobApplication(Candidate candidate, JobOpening jobOpening) {
        this.candidate = candidate;
        this.jobOpening = jobOpening;
        this.status = "Pending"; // O status inicial é sempre "Pendente"
        this.requirementAnswersPath = null;
        this.requirementEvaluation = false;
        this.interviewAnswersPath = null;
        this.interviewGrades = 0;
    }

    // Construtor protegido para JPA
    protected jobApplication() {
    }

    public Candidate candidate() {
        return this.candidate;
    }

    public JobOpening jobOpening() {
        return this.jobOpening;
    }

    public String status() {
        return this.status;
    }

    public void approve() {
        this.status = "Approved";
    }

    public void reject() {
        this.status = "Rejected";
    }

    public void updateResponses(String responses) {
        this.requirementAnswersPath = responses;
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
