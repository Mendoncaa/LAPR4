package core.management.jobOpening.domain;

import lombok.Getter;

import java.io.Serializable;

public enum JobMode implements Serializable {

    REMOTE("Remote"), HYBRID("Hybrid"), ONSITE("Onsite");

    @Getter
    private final String description;

    JobMode(String description) {
        this.description = description;
    }
}
