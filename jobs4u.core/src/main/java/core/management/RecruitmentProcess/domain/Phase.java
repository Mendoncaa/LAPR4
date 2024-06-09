package core.management.RecruitmentProcess.domain;

import eapli.framework.domain.model.ValueObject;
import jakarta.persistence.*;
import lombok.Getter;

import java.time.LocalDate;

@Entity
public class Phase implements ValueObject {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Getter
    private PhaseName name;

    @Embedded
    private StartDate startDate;

    @Embedded
    private EndDate endDate;

    @Getter
    private PhaseStatus phaseStatus;

    public Phase(PhaseName name, LocalDate startDate, LocalDate endDate, PhaseStatus phaseStatus) {
        this.name = name;
        this.startDate = new StartDate(startDate);
        this.endDate = new EndDate(endDate);
        this.phaseStatus = phaseStatus;
    }

    public Phase() {
    }
    public Phase(PhaseName name) {
        this.name = name;
        this.phaseStatus = PhaseStatus.CLOSED;
    }

    public void open() {
        this.phaseStatus = PhaseStatus.OPEN;
    }

    public void close() {
        this.phaseStatus = PhaseStatus.CLOSED;
    }
}
