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
    private ApplicationState applicationState; // O status da aplicação

    @Embedded
    @AttributeOverride(name="filePath", column=@Column(name="requirement_answers_path"))
    @AttributeOverride(name="fileType", column=@Column(name="requirement_answers_type"))
    private File requirementAnswersPath; // As respostas do candidato às questões de requisitos

    @Embedded
    private Requirements requirements; // A avaliação dos requisitos

    @Embedded
    @AttributeOverride(name="filePath", column=@Column(name="interview_answers_path"))
    @AttributeOverride(name="fileType", column=@Column(name="interview_answers_type"))
    private File interviewAnswersPath; // As notas da entrevista

    private NotificationStatus notificationStatus; // O status da notificação

    @Embedded
    private Interview interview; // A entrevista

    // Construtor com argumentos essenciais
    public jobApplication(Candidate candidate, JobOpening jobOpening) {
        this.candidate = candidate;
        this.jobOpening = jobOpening;
        this.applicationState = ApplicationState.SUBMITTED;
        this.requirementAnswersPath = null;
        this.requirements = Requirements.valueOf(RequirementsEvaluation.PENDING, RequirementsJustification.valueOf("Sem justificação"));
        this.interviewAnswersPath = null;
        this.notificationStatus = NotificationStatus.UNSEND;
        this.interview = null;
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

    public ApplicationState status() {
        return this.applicationState;
    }

    public void approve() {
        this.applicationState = ApplicationState.ACCEPTED;
    }

    public void reject() {
        this.applicationState = ApplicationState.REJECTED;
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
