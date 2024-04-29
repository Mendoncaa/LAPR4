package core.jobOpening.domain;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;

@Embeddable
public class JobState {
    @Enumerated(EnumType.STRING)
    @Column(name = "job_state")
    private State value;

    public JobState(State value) {
        this.value = value;
    }

    public State getValue() {
        return value;
    }

    public void setValue(State value) {
        this.value = value;
    }

    public enum State {
        OPEN, CLOSED
    }
}
