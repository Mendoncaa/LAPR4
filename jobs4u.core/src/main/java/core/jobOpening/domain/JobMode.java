package core.jobOpening.domain;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;

@Embeddable
public class JobMode {
    @Enumerated(EnumType.STRING)
    @Column(name = "job_mode")
    private Mode value;

    public JobMode(Mode value) {
        this.value = value;
    }

    public Mode getValue() {
        return value;
    }

    public void setValue(Mode value) {
        this.value = value;
    }

    public enum Mode {
        REMOTE, HYBRID, ONSITE
    }
}
