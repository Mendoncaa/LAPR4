package core.Application.domain;

import javax.persistence.*;
import lombok.*;

@NoArgsConstructor
@Getter
@Embeddable
public class FilePath {
    private String path;

    public FilePath(String path) {
        if (path == null || path.isEmpty()) {
            throw new IllegalArgumentException("File path cannot be empty");
        }
        this.path = path;
    }
}
