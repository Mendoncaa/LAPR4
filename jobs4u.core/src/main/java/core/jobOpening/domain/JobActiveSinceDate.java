package core.jobOpening.domain;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.util.Date;

@Embeddable
public class JobActiveSinceDate {
    @Column(name = "job_active_since_date")
    private Date value;

    public JobActiveSinceDate(Date value) {
        this.value = value;
    }

    public Date getValue() {
        return value;
    }

    public void setValue(Date value) {
        this.value = value;
    }
}
