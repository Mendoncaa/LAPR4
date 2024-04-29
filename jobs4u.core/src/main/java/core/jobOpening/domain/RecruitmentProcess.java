package core.jobOpening.domain;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "recruitment_process")
public class RecruitmentProcess {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToMany(mappedBy = "recruitmentProcess", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Phase> phases;

    public RecruitmentProcess() {
    }

    // Getters and setters
}
