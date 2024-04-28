package core.jobOpening.domain;


import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class Title {
    @Column(name = "title")
    private String value;
}
