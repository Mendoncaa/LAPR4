/*package core.management.jobApplication.domain;


// import sem4pi.core.management.candidate.domain.Candidate;
import core.management.job.domain.JobOpening;

public class Application {
    private Long id;
    private Candidate candidate;
    private JobOpening jobOpening;
    private String status;  // Exemplos de status: "Pending", "Approved", "Rejected"

    public Application(Candidate candidate, JobOpening jobOpening) {
        this.candidate = candidate;
        this.jobOpening = jobOpening;
        this.status = "Pending";  // Estado inicial padrão
    }

    // Encapsula a transição de estados, garantindo controle sobre o fluxo de mudança de estado
    public void approve() {
        if (!"Pending".equals(status)) {
            throw new IllegalStateException("Only pending applications can be approved.");
        }
        this.status = "Approved";
    }

    public void reject() {
        if (!"Pending".equals(status)) {
            throw new IllegalStateException("Only pending applications can be rejected.");
        }
        this.status = "Rejected";
    }

    // Métodos de acesso controlado para consulta sem modificar o estado interno
    public Long getApplicationId() {
        return this.id;
    }

    public String getApplicationStatus() {
        return this.status;
    }

    public Candidate getAssociatedCandidate() {
        return this.candidate;
    }

    public JobOpening getAssociatedJobOpening() {
        return this.jobOpening;
    }
}
*/