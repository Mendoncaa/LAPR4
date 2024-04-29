package core.Application.domain;

import javax.persistence.*;
import lombok.*;

@NoArgsConstructor
@Getter
@Embeddable
public class ApplicationID {
    private String id;

    public ApplicationID(String id) {
        if (id == null || id.isEmpty()) {
            throw new IllegalArgumentException("Application ID cannot be empty");
        }
        this.id = id;
    }
}