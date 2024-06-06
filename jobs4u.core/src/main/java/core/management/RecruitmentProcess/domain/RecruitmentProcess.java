package core.management.RecruitmentProcess.domain;

import eapli.framework.domain.model.ValueObject;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@Entity
public class RecruitmentProcess implements ValueObject {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Enumerated(EnumType.STRING)
    private RecruitmentProcessStatus status;

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<Phase> phases;

    public RecruitmentProcess() {
        this.phases = new ArrayList<>();
        this.status = RecruitmentProcessStatus.UNINITIATED;
    }

    public void addPhase(Phase phase) {
        this.phases.add(phase);
    }

    public void removePhase(Phase phase) {
        this.phases.remove(phase);
    }

    public boolean nextPhase() {
        Phase currentPhase = currentPhase();
        if (currentPhase == null) {
            if (status == RecruitmentProcessStatus.UNINITIATED) {
                for (Phase phase : phases) {
                    if (phase.getName() == PhaseName.APPLICATION) {
                        phase.open();
                        break;
                    }
                }
                this.status = RecruitmentProcessStatus.IN_PROCESS;
                return true;
            }
            return false;
        }

        int index = phases.indexOf(currentPhase);

        switch (currentPhase.getName()) {
            case APPLICATION:
                phases.get(index).close();
                openPhaseByName(PhaseName.SCREENING);
                break;
            case SCREENING:
                phases.get(index).close();
                if (!openPhaseByName(PhaseName.INTERVIEWS)) {
                    openPhaseByName(PhaseName.ANALYSIS);
                }
                break;
            case INTERVIEWS:
                phases.get(index).close();
                openPhaseByName(PhaseName.ANALYSIS);
                break;
            case ANALYSIS:
                phases.get(index).close();
                openPhaseByName(PhaseName.RESULT);
                break;
            case RESULT:
                phases.get(index).close();
                this.status = RecruitmentProcessStatus.FINISHED;
                break;
            default:
                return false;
        }
        return true;
    }

    public boolean previousPhase() {
        Phase currentPhase = currentPhase();
        if (currentPhase == null) {
            return false;
        }

        int index = phases.indexOf(currentPhase);

        switch (currentPhase.getName()) {
            case APPLICATION:
                return false; // Can't move back from the first phase
            case SCREENING:
                phases.get(index).close();
                openPhaseByName(PhaseName.APPLICATION);
                break;
            case INTERVIEWS:
                phases.get(index).close();
                openPhaseByName(PhaseName.SCREENING);
                break;
            case ANALYSIS:
                phases.get(index).close();
                if (!openPhaseByName(PhaseName.INTERVIEWS)) {
                    openPhaseByName(PhaseName.SCREENING);
                }
                break;
            case RESULT:
                phases.get(index).close();
                openPhaseByName(PhaseName.ANALYSIS);
                break;
            default:
                return false;
        }
        return true;
    }

    private boolean openPhaseByName(PhaseName phaseName) {
        for (Phase phase : phases) {
            if (phase.getName() == phaseName) {
                phase.open();
                return true;
            }
        }
        return false;
    }

    public Phase currentPhase() {
        if (this.status != RecruitmentProcessStatus.IN_PROCESS) {
            return null; // Recruitment process is not in progress
        }

        for (Phase phase : phases) {
            if (phase.getPhaseStatus() == PhaseStatus.OPEN) {
                return phase;
            }
        }
        return null; // No phase is currently open
    }
}
