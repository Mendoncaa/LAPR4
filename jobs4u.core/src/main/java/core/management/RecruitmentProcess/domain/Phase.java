package core.management.RecruitmentProcess.domain;

import eapli.framework.domain.model.ValueObject;
import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
public class Phase implements ValueObject {

    @EmbeddedId
    private PhaseName name;

    @Embedded
    private StartDate startDate;

    @Embedded
    private EndDate endDate;

    @Embedded
    private Status status;

    @ManyToOne
    private RecruitmentProcess recruitmentProcess;

    public Phase(PhaseName name, LocalDate startDate, LocalDate endDate, Status status) {
        this.name = name;
        this.startDate = new StartDate(startDate);
        this.endDate = new EndDate(endDate);
        this.status = status;
    }

    public Phase() {
    }
}
