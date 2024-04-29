package core.jobOpening.domain;


import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class JobNrVacancies {
    @Column(name = "number_of_vacancies")
    private int value;

    public JobNrVacancies(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
}