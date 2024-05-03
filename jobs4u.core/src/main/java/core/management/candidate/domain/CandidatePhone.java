package core.management.candidate.domain;

import eapli.framework.domain.model.ValueObject;
import eapli.framework.validations.Preconditions;

public class CandidatePhone implements ValueObject {
    private final String address;

    private CandidatePhone(String address) {
        this.address = address;
    }

    public static CandidatePhone valueOf(String address) {
        Preconditions.nonEmpty(address, "Address cannot be empty");
        // Additional validation logic can be added here
        return new CandidatePhone(address);
    }

    @Override
    public String toString() {
        return address;
    }
}
