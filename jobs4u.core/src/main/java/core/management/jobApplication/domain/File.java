package core.management.jobApplication.domain;

import eapli.framework.validations.Preconditions;
import jakarta.persistence.Embeddable;
import jakarta.persistence.Embedded;
import lombok.Getter;
import lombok.Setter;

@Embeddable
@Getter
@Setter
public class File {

    private String filePath;

    private FileType fileType;

    private File(String filePath, FileType fileType) {
        Preconditions.nonNull(filePath, "File path cannot be null");
        Preconditions.nonNull(fileType, "File type cannot be null");
        this.filePath = filePath;
        this.fileType = fileType;
    }

    protected File() {
        this.filePath = null;
        this.fileType = null;
    }

    public static File valueOf(String filePath, FileType fileType) {
        return new File(filePath, fileType);
    }

    @Override
    public String toString() {
        return filePath.toString() + "." + fileType.toString();
    }

}
