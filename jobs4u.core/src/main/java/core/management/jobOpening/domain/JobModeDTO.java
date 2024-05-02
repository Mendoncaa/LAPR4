package core.management.jobOpening.domain;

import eapli.framework.representations.dto.DTO;
import lombok.AllArgsConstructor;
import lombok.Getter;

import java.lang.annotation.Annotation;

@AllArgsConstructor
public class JobModeDTO implements DTO {

    @Getter
    private String description;


    @Override
    public String toString() {
        return description;
    }

    @Override
    public Class<? extends Annotation> annotationType() {
        return null;
    }

}
