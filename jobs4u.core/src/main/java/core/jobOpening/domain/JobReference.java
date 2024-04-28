package core.jobOpening.domain;

import java.util.UUID;

public class JobReference {
    private final String id;

    public JobReference() {
        this.id = UUID.randomUUID().toString();
    }

    public String getId() {
        return id;
    }

    @Override
    public String toString() {
        return "JobReference{" +
                "id='" + id + '\'' +
                '}';
    }
}

