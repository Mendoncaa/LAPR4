package core.management.candidate.domain;

import eapli.framework.domain.model.ValueObject;
import eapli.framework.validations.Preconditions;
import jakarta.persistence.Embeddable;

@Embeddable
public class CandidateName implements ValueObject {
    private final String candidateName;

    public CandidateName(String customerName) {
        this.candidateName = customerName;
    }

    public CandidateName() {
        this.candidateName = "";
    }

    public static CandidateName valueOf(String candidateName) {
        Preconditions.nonEmpty(candidateName, "Customer Name cannot be empty");
        // Additional validation logic can be added here
        return new CandidateName(candidateName);
    }

    @Override
    public String toString() {
        return candidateName;
    }
}
