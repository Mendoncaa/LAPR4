package domain;


import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class NrVacancies{
    @Column(name = "number_of_vacancies")
    private int value;
}
