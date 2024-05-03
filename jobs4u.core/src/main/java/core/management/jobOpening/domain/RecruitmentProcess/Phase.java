package core.management.jobOpening.domain.RecruitmentProcess;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity
public class Phase {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private PhaseName name;
    private StartDate startDate;
    private EndDate endDate;
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


    // Getters and setters
}