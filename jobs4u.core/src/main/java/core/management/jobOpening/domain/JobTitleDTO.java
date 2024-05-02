package core.management.jobOpening.domain;


import eapli.framework.representations.dto.DTO;
import lombok.AllArgsConstructor;
import lombok.Getter;

import java.lang.annotation.Annotation;

@AllArgsConstructor
public class JobTitleDTO implements DTO {

    @Getter
    private String jobTitle;

    @Override
    public String toString() {
        return jobTitle;
    }

    @Override
    public Class<? extends Annotation> annotationType() {
        return null;
    }

}


