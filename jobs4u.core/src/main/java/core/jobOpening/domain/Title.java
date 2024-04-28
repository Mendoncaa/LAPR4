package core.jobOpening.domain;


import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class Title {
    @Column(name = "title")
    private String value;

    public Title(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}

