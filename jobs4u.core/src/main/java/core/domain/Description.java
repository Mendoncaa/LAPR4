package core.domain;


import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class Description {
    @Column(name = "description")
    private String value;

    public Description(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}