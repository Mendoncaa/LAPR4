package core.management.plugins.interviewModel.domain;


import core.management.plugins.JarFile;
import core.management.plugins.SpecName;
import eapli.framework.general.domain.model.Description;
import jakarta.persistence.Entity;

public class InterviewModel {
    private JarFile jarFile;
    private SpecName specName;
    private Description description;

    public  InterviewModel (JarFile jarFile, SpecName specName, Description description) {
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


