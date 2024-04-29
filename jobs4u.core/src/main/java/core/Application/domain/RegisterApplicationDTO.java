package core.Application.domain;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter
public class RegisterApplicationDTO {
    private String applicationID;
    private String filePath;
    private String fileType;

    public RegisterApplicationDTO(String applicationID, String filePath, String fileType) {
        this.applicationID = applicationID;
        this.filePath = filePath;
        this.fileType = fileType;
    }
}
