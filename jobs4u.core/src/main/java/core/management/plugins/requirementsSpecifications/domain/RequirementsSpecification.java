package core.management.plugins.requirementsSpecifications.domain;

import core.management.plugins.JarFile;
import core.management.plugins.SpecName;
import eapli.framework.domain.model.AggregateRoot;
import eapli.framework.general.domain.model.Description;
import jakarta.persistence.*;

@Entity
public class RequirementsSpecification implements AggregateRoot<SpecName> {

    @EmbeddedId
    @Column(nullable = false)
    private SpecName specName;

    @Embedded
    @Column(nullable = false)
    private JarFile jarFile;

    @Embedded
    @Column(nullable = false)
    private Description description;

    public RequirementsSpecification(JarFile jarFile, SpecName specName, Description description) {
        this.jarFile = jarFile;
        this.specName = specName;
        this.description = description;
    }

    public RequirementsSpecification() {

    }

    @Override
    public boolean sameAs(Object other) {
        return false;
    }

    @Override
    public SpecName identity() {
        return null;
    }
}

