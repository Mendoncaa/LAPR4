package core.management.jobOpening.domain;

import eapli.framework.domain.model.ValueObject;
import lombok.Getter;

@Getter
public enum JobState implements ValueObject {
    OPENED("Opened"),
    CLOSED("Closed");

    private final String jobState;

    JobState(String jobState) {
        this.jobState = jobState;
    }
}