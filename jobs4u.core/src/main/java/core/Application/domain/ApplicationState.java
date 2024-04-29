package core.Application.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.io.Serializable;

public enum ApplicationState {
    OPENED("Opened"), CLOSED("Closed"), PENDING("Pending");

    @Getter
    private final String description;

    ApplicationState(String description) {
        this.description = description;
    }
}
