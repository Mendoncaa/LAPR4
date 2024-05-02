package core.management.jobOpening.domain;

import jakarta.persistence.Embeddable;
import lombok.*;
import core.infrastructure.domain.ValueObject;
import shared.exception.DomainInvariantViolatedException;

@NoArgsConstructor(access = AccessLevel.PROTECTED)
@EqualsAndHashCode
@Embeddable
public class JobReference implements ValueObject, Comparable<JobReference> {

    private String jobReference;

    @Override
    public String toString() {
        return jobReference;
    }

    public JobReference (String jobReference2) throws DomainInvariantViolatedException {
        if(jobReference2 == null) {
            throw new DomainInvariantViolatedException("The course jobReference is invalid!");
        }
        if(!jobReference2.matches("^[a-zA-Z0-9\\-]{1,30}$")) {
            throw new DomainInvariantViolatedException("The course jobReference is invalid!");
        }
        this.jobReference = jobReference2;
    }

    @Override
    public int compareTo(JobReference o) {
        return 0;
    }
}
