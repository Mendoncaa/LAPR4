package core.management.plugins;

import eapli.framework.domain.model.ValueObject;
import jakarta.persistence.Embeddable;
import lombok.AccessLevel;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor(access = AccessLevel.PROTECTED)
@EqualsAndHashCode
@Embeddable
@Getter
public class SpecName implements ValueObject, Comparable<SpecName> {
    private String name;

    public SpecName(String name) {
            this.name = name;
        }

    public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

    @Override
    public int compareTo(SpecName o) {
        return this.name.compareTo(o.name);
    }
}

