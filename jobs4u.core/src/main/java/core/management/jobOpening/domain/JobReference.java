package core.management.jobOpening.domain;

import eapli.framework.domain.model.ValueObject;
import jakarta.persistence.Embeddable;
import lombok.*;


@NoArgsConstructor(access = AccessLevel.PROTECTED)
@EqualsAndHashCode
@Embeddable
public class JobReference implements ValueObject, Comparable<JobReference> {

    private String jobReference;

    @Override
    public String toString() {
        return jobReference;
    }

    @Override
    public int compareTo(JobReference o) {
        return jobReference.compareTo(o.jobReference);
    }

    public JobReference(String jobReference) {
        this.jobReference = jobReference;
    }
}
