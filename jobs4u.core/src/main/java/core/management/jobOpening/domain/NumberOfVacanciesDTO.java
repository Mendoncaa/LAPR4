package core.management.jobOpening.domain;


import eapli.framework.representations.dto.DTO;
import lombok.AllArgsConstructor;
import lombok.Getter;

import java.lang.annotation.Annotation;

@AllArgsConstructor
public class NumberOfVacanciesDTO implements DTO {

    @Getter
    private String numberOfVacancies;

    @Override
    public String toString() {
        return numberOfVacancies;
    }

    @Override
    public Class<? extends Annotation> annotationType() {
        return null;
    }

}


