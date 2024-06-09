package core.management.jobApplication.domain;


import eapli.framework.domain.model.ValueObject;
import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import lombok.Getter;
import lombok.NoArgsConstructor;
import shared.exception.DomainInvariantViolatedException;

@Getter
public enum ApplicationState implements ValueObject {
    REJECTED,
    SUBMITTED,
    ACCEPTED;
}
