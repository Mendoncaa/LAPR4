package core.management.jobOpening.domain;

import eapli.framework.domain.model.ValueObject;
import lombok.Getter;

public enum JobState implements ValueObject {
    OPENED("Opened"),
    CLOSED("Closed");

    @Getter
    private final String jobState;

    JobState(String jobState) {
        this.jobState = jobState;
    }
}