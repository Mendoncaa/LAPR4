package core.Application.domain;

import javax.persistence.*;

import core.Application.domain.ApplicationID;
import lombok.*;

@Entity
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@Getter
public class Application {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Embedded
    private ApplicationID applicationID;

    @Embedded
    private FilePath filePath;

    @Embedded
    private FileType fileType;

    public Application(ApplicationID applicationID, FilePath filePath, FileType fileType) {
        this.applicationID = applicationID;
        this.filePath = filePath;
        this.fileType = fileType;
    }
}
