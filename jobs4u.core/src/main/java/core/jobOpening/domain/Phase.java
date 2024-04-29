package core.jobOpening.domain;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "phase")
public class Phase {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private PhaseName phaseName;

    @Column(nullable = false)
    private Date startDate;

    @Column(nullable = true)
    private Date endDate;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private Status status;

    @ManyToOne
    @JoinColumn(name = "recruitment_process_id", nullable = false)
    private RecruitmentProcess recruitmentProcess;

    public Phase() {
    }

    // Constructors, getters, and setters
}
