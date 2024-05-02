package core.management.jobOpening.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.io.Serializable;

public enum ContractType {

    FULL_TIME("Full Time"), PART_TIME("Part Time");

    @Getter
    private final String description;

    ContractType(String description) {
        this.description = description;
    }
}
