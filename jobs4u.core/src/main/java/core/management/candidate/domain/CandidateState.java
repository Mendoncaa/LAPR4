package core.management.candidate.domain;

import eapli.framework.domain.model.ValueObject;
import eapli.framework.validations.Preconditions;

public class CandidateState implements ValueObject {
    private final String state;

    private CandidateState(String state) {
        this.state = state;
    }

    public static CandidateState valueOf(String state) {
        Preconditions.nonEmpty(state, "State cannot be empty");
        // Additional validation logic can be added here
        return new CandidateState(state);
    }

    @Override
    public String toString() {
        return state;
    }
}
