package core.management.InterviewModel.domain;

import eapli.framework.domain.model.AggregateRoot;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Objects;

@Getter
@Setter
@NoArgsConstructor
@Entity
public class InterviewModel implements AggregateRoot<String> {

    @Id
    @Column(nullable = false, unique = true)
    private String name;

    @Column(nullable = false)
    private String jarPath;


    public InterviewModel(String name, String jarPath) {
        this.name = name;
        this.jarPath = jarPath;
    }

    @Override
    public boolean sameAs(Object other) {
        if (this == other) return true;
        if (other == null || getClass() != other.getClass()) return false;
        InterviewModel plugin = (InterviewModel) other;
        return name.equals(plugin.name);
    }

    @Override
    public String identity() {
        return name;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, jarPath);
    }
}
