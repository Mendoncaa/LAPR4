package core.Application.domain;

import javax.persistence.*;
import lombok.*;

@NoArgsConstructor
@Getter
@Embeddable
public class FileType {
    private String type;

    public FileType(String type) {
        if (type == null || type.isEmpty()) {
            throw new IllegalArgumentException("File type cannot be empty");
        }
        this.type = type;
    }
}