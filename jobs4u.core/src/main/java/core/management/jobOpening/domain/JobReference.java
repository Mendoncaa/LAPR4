package core.management.jobOpening.domain;

import jakarta.persistence.Embeddable;
import lombok.*;

import java.io.Serializable;

@NoArgsConstructor(access = AccessLevel.PROTECTED)
@EqualsAndHashCode
@Embeddable
public class JobReference implements Comparable<JobReference>, Serializable {

    private String jobReference;

    @Override
    public String toString() {
        return jobReference;
    }



    @Override
    public int compareTo(JobReference o) {
        return jobReference.compareTo(o.jobReference);
    }
}
