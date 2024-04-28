package core.jobOpening.domain;


import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class Description {
    @Column(name = "description")
    private String value;
}
