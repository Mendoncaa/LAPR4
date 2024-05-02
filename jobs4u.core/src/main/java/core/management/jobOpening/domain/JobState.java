package core.management.jobOpening.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.io.Serializable;

public enum JobState {
    OPENED("Opened"), CLOSED("Closed");

    @Getter
    private final String description;

    JobState(String description) {
        this.description = description;
    }
}
