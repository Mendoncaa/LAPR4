package core.management.plugins.requirementsSpecifications.domain;

import core.management.plugins.JarFile;
import core.management.plugins.SpecName;
import eapli.framework.general.domain.model.Description;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Version;

@Entity
public class RequirementsSpecification {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;


    private JarFile jarFile;


    private SpecName specName;


    private Description description;

    public RequirementsSpecification() {

    }

    public RequirementsSpecification(JarFile jarFile, SpecName specName, Description description) {
        this.jarFile = jarFile;
        this.specName = specName;
        this.description = description;
    }

    public JarFile getJarFile() {
        return jarFile;
    }

    public void setJarFile(JarFile jarFile) {
        this.jarFile = jarFile;
    }

    public SpecName getSpecName() {
        return specName;
    }

    public void setSpecName(SpecName specName) {
        this.specName = specName;
    }

    public Description getDescription() {
        return description;
    }

    public void setDescription(Description description) {
        this.description = description;
    }
}

