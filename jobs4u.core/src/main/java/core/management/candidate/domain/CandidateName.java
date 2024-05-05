package core.management.candidate.domain;

import eapli.framework.domain.model.ValueObject;
import eapli.framework.validations.Preconditions;
import jakarta.persistence.Embeddable;

@Embeddable
public class CandidateName implements ValueObject {
    
    private final String firstName;
    private final String lastName;


    public CandidateName(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        

    }

    public CandidateName() {
        this.firstName = "";
        this.lastName = "";
    }

    public static CandidateName valueOf(String firstName, String lastName) {
        Preconditions.nonEmpty(firstName, "Customer Name cannot be empty");
        Preconditions.nonEmpty(lastName, "Last name cannot be empty");
        return new CandidateName(firstName, lastName);
    }

    @Override
    public String toString() {
        return firstName + " " + lastName;
    }
}
