package core.management.jobApplication.domain;


import eapli.framework.domain.model.ValueObject;
import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import lombok.NoArgsConstructor;
import shared.exception.DomainInvariantViolatedException;

@NoArgsConstructor
@Embeddable
public class ApplicationState implements ValueObject {

    @Column(length = 100, nullable = false)
    private String state;

    @Override
    public String toString() {
        return state;
    }

    public ApplicationState (String title) throws DomainInvariantViolatedException {
        if (title == null) {
            throw new DomainInvariantViolatedException("The state is invalid!");
        }
        if(title.length() > 100) {
            throw new DomainInvariantViolatedException("The state is too long!");
        }
        this.state = state;
    }
}
