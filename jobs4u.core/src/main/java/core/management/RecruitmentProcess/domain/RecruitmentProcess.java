package core.management.RecruitmentProcess.domain;

import jakarta.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class RecruitmentProcess {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinColumn(name = "recruitmentProcessId")
    private List<Phase> phases;

    public RecruitmentProcess() {
        this.phases = new ArrayList<>();
    }

    public void addPhase(Phase phase) {
        this.phases.add(phase);
    }

    public void removePhase(Phase phase) {
        this.phases.remove(phase);
    }

    public List<Phase> Phases() {
        return this.phases;
    }
}


