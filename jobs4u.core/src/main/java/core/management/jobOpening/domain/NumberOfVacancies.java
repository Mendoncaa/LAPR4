package core.management.jobOpening.domain;

import eapli.framework.domain.model.ValueObject;

public class NumberOfVacancies implements ValueObject {
    private final int number;

    public NumberOfVacancies(int number) {
        if (number <= 0) {
            throw new IllegalArgumentException("Number of vacancies must be greater than zero");
        }
        this.number = number;
    }
}
