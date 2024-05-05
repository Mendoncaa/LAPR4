package core.management.candidate.domain;

import eapli.framework.domain.model.ValueObject;
import eapli.framework.validations.Preconditions;

public enum CandidateState implements ValueObject {
    ENABLED("Enabled"),
    DISABLED("Disabled");

    private final String description;

    private CandidateState(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return description;
    }
}
