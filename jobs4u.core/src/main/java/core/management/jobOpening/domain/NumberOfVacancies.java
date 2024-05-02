package core.management.jobOpening.domain;

import java.io.Serializable;

public class NumberOfVacancies implements Comparable<NumberOfVacancies>, Serializable {
    private final int numberOfVacancies;

    public NumberOfVacancies(int numberOfVacancies) {
        this.numberOfVacancies = numberOfVacancies;
    }

    @Override
    public int compareTo(NumberOfVacancies o) {
        return Integer.compare(numberOfVacancies, o.numberOfVacancies);
    }
}
