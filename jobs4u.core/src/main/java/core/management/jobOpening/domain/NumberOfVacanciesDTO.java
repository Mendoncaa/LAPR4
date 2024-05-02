package core.management.jobOpening.domain;


import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
public class NumberOfVacanciesDTO {

    @Getter
    private String numberOfVacancies;

    @Override
    public String toString() {
        return numberOfVacancies;
    }

}


