package core.management.jobOpening.domain.RegisterJobOpening;

import jakarta.persistence.Embeddable;
import lombok.*;
import core.infrastructure.domain.ValueObject;
import shared.exception.DomainInvariantViolatedException;

@NoArgsConstructor(access = AccessLevel.PROTECTED)
@EqualsAndHashCode
@Embeddable
public class JobReference implements ValueObject {

    private String jobReference;

    @Override
    public String toString() {
        return jobReference;
    }

    public JobReference (JobReference jobReference2) throws DomainInvariantViolatedException {
        if(jobReference2 == null) {
            throw new DomainInvariantViolatedException("The course jobReference is invalid!");
        }
        if(!jobReference2.matches("^[a-zA-Z0-9\\-]{1,30}$")) {
            throw new DomainInvariantViolatedException("The course jobReference is invalid!");
        }
        this.jobReference = jobReference2;
    }

}
