package core.management.jobOpening.domain;

import lombok.Getter;

import java.io.Serializable;

public enum JobState implements Serializable {
    OPENED("Opened"), CLOSED("Closed");

    @Getter
    private final String description;

    JobState(String description) {
        this.description = description;
    }

}
