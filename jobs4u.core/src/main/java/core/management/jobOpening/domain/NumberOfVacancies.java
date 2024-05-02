package core.management.jobOpening.domain;

import eapli.framework.domain.model.ValueObject;

import java.io.Serializable;

public class NumberOfVacancies implements ValueObject {
    private final int numberOfVacancies;

    public NumberOfVacancies(int numberOfVacancies) {
        this.numberOfVacancies = numberOfVacancies;
    }

}
