package core.management.plugins.interviewModel.domain;


import core.management.plugins.JarFile;
import core.management.plugins.SpecName;
import eapli.framework.domain.model.AggregateRoot;
import eapli.framework.general.domain.model.Description;
import jakarta.persistence.*;
import lombok.Getter;

@Entity
@Table(name = "interview_model")
@Access(AccessType.FIELD)
public class InterviewModel implements AggregateRoot<SpecName> {

    @EmbeddedId
    @Column(nullable = false)
    private SpecName specName;

    @Embedded
    @Column(nullable = false)
    private JarFile jarFile;

    @Embedded
    @Column(nullable = false)
    private Description description;

    public  InterviewModel (JarFile jarFile, SpecName specName, Description description) {
        this.jarFile = jarFile;
        this.specName = specName;
        this.description = description;
    }

    public InterviewModel() {

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


