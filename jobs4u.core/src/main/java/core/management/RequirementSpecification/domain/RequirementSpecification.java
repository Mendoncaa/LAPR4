package core.management.RequirementSpecification.domain;

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
public class RequirementSpecification implements AggregateRoot<String> {

    @Id
    @Column(nullable = false, unique = true)
    private String name;

    @Column(nullable = false)
    private String templatePath;

    public RequirementSpecification(String name, String jarPath) {
        this.name = name;
        this.templatePath = jarPath;
    }

    @Override
    public boolean sameAs(Object other) {
        if (this == other) return true;
        if (other == null || getClass() != other.getClass()) return false;
        RequirementSpecification plugin = (RequirementSpecification) other;
        return name.equals(plugin.name);
    }

    @Override
    public String identity() {
        return name;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, templatePath);
    }
}
