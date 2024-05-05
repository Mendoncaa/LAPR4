package core.management.plugins;

import eapli.framework.domain.model.ValueObject;
import jakarta.persistence.Embeddable;

@Embeddable
public class SpecName implements ValueObject {
        private String name;

        public SpecName(String name) {
            this.name = name;
        }

    protected SpecName() {

    }

    public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }

