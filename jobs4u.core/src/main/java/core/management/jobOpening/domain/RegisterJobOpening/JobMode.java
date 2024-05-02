package core.management.jobOpening.domain.RegisterJobOpening;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.io.Serializable;

public enum JobMode {
    
    OPENED("Opened"), CLOSED("Closed"); 

    @Getter
    private final String description;

    JobMode(String description) {
        this.description = description;
    }
}
