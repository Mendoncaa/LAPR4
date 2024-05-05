package core.management.plugins;

import eapli.framework.domain.model.ValueObject;
import jakarta.persistence.Embeddable;
import lombok.Getter;

@Getter
@Embeddable
public class JarFile implements ValueObject {
    private String path;

    public JarFile(String path) {
            this.path = path;
        }

    protected JarFile() {

    }

    public String getPath() {
            return path;
        }

        public void setPath(String path) {
            this.path = path;
        }
    }



