/*
package app.backoffice.aplicacao;

import lombok.NonNull;
import lombok.RequiredArgsConstructor;
// import org.springframework.stereotype.Controller;


import core.Application.domain.FilePath;
import core.Application.domain.FileType;
import core.Application.domain.Application;
import core.Application.domain.ApplicationID;
import core.Application.persistance.ApplicationRepository;
import core.Application.domain.RegisterApplicationDTO;

 
// @RequiredArgsConstructor
// @Controller

public class RegisterApplicationController {
    @NonNull
    private ApplicationRepository applicationRepository;

    public boolean registerApplication(RegisterApplicationDTO registerApplicationDTO) {
        try {
            ApplicationID applicationID = new ApplicationID(registerApplicationDTO.getApplicationID());
            FilePath filePath = new FilePath(registerApplicationDTO.getFilePath());
            FileType fileType = new FileType(registerApplicationDTO.getFileType());
            Application application = new Application(applicationID, filePath, fileType);

            if (applicationRepository.findByApplicationID(application.getApplicationID()) == null) {
                applicationRepository.save(application);        // error save due to springFrameowork is not implemented
                return true;
            }
            return false;
        
        } catch (Exception e) {
            return false;
        }
    }
}
*/