package core.management.candidate.domain;

import eapli.framework.domain.model.ValueObject;
import eapli.framework.validations.Preconditions;

public class CandidateState implements ValueObject {
    private final String address;

    private CandidateState(String address) {
        this.address = address;
    }

    public static CandidateState valueOf(String address) {
        Preconditions.nonEmpty(address, "Address cannot be empty");
        // Additional validation logic can be added here
        return new CandidateState(address);
    }

    @Override
    public String toString() {
        return address;
    }
}
