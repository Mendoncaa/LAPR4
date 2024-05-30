package core.management.RecruitmentProcess.domain;

import jakarta.persistence.Embeddable;
import jakarta.persistence.Embedded;
import lombok.Getter;

@Getter
public enum RecruitmentProcessStatus {
    UNINITIATED("Uninitiated"),
    IN_PROCESS("In process"),
    FINISHED("Finished");

    private final String description;

    RecruitmentProcessStatus(String description) {
        this.description = description;
    }
}