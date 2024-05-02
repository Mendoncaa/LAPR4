package core.management.jobApplication.domain;

import eapli.framework.domain.model.ValueObject;
import jakarta.persistence.Embeddable;
import lombok.*;

import shared.exception.DomainInvariantViolatedException;

@NoArgsConstructor(access = AccessLevel.PROTECTED)
@EqualsAndHashCode
@Embeddable
public class ApplicationID implements ValueObject, Comparable<ApplicationID> {

    private String applicationID;

    @Override
    public String toString() {
        return applicationID;
    }

    public ApplicationID (String applicationID) throws DomainInvariantViolatedException {
        if(applicationID == null) {
            throw new DomainInvariantViolatedException("The course ApplicationID is invalid!");
        }
        if(applicationID.matches("^[a-zA-Z0-9\\-]{1,30}$")) {
            throw new DomainInvariantViolatedException("The course ApplicationID is invalid!");
        }
        this.applicationID = applicationID;
    }

    @Override
    public int compareTo(ApplicationID o) {
        return 0;
    }
}
