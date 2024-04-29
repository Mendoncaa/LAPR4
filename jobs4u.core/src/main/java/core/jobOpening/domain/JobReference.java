package core.jobOpening.domain;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class JobReference {
    @Column(name = "job_reference")
    private String value;

    public JobReference(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
