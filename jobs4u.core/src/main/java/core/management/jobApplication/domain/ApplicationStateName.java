package core.management.jobApplication.domain;

public enum ApplicationStateName {

    OPENED("Opened"), CLOSED("Closed"), PENDING("Pending");

    private final String description;

    ApplicationStateName(String description) {
        this.description = description;
    }
    
}
