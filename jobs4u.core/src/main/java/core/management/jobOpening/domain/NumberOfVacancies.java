package core.management.jobOpening.domain;

import eapli.framework.domain.model.ValueObject;
import jakarta.persistence.Embeddable;
import lombok.Getter;

@Getter
@Embeddable
public class NumberOfVacancies implements ValueObject {
    private final int number;

    public NumberOfVacancies(int number) {
        if (number <= 0) {
            throw new IllegalArgumentException("Number of vacancies must be greater than zero");
        }
        this.number = number;
    }

    protected NumberOfVacancies() {
        this.number = -1;
    }

    @Override
    public String toString() {
        return String.valueOf(number);
    }
}
