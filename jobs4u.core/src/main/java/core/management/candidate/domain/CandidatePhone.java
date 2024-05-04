package core.management.candidate.domain;

import eapli.framework.domain.model.ValueObject;
import eapli.framework.validations.Preconditions;

public class CandidatePhone implements ValueObject {
    private final String phoneNumber;

    public CandidatePhone(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public static CandidatePhone valueOf(String phoneNumber) {
        Preconditions.nonEmpty(phoneNumber, "PhoneNumber cannot be empty");
        // Additional validation logic can be added here
        return new CandidatePhone(phoneNumber);
    }

    @Override
    public String toString() {
        return phoneNumber;
    }
}
