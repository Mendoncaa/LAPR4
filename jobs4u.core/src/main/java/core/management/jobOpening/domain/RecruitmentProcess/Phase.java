package core.management.jobOpening.domain.RecruitmentProcess;

import jakarta.persistence.*;

@Entity
public class Phase {

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

    public Phase(PhaseName name, StartDate startDate, EndDate endDate, Status status) {
        this.name = name;
        this.startDate = startDate;
        this.endDate = endDate;
        this.status = status;
    }

    public Phase() {

    }


}