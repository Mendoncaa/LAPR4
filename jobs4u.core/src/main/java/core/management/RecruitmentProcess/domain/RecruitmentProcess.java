package core.management.RecruitmentProcess.domain;

import eapli.framework.domain.model.ValueObject;
import jakarta.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class RecruitmentProcess implements ValueObject{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Enumerated(EnumType.STRING)
    private RecruitmentProcessStatus status;

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
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


