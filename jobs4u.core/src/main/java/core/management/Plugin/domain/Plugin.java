package core.management.Plugin.domain;

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
public class Plugin implements AggregateRoot<String> {

    @Id
    @Column(nullable = false, unique = true)
    private String name;

    @Column(nullable = false)
    private String jarPath;

    @Enumerated(EnumType.STRING)
    private PluginType type;


    public Plugin(String name, String jarPath, PluginType type) {
        this.name = name;
        this.jarPath = jarPath;
        this.type = type;
    }

    @Override
    public boolean sameAs(Object other) {
        if (this == other) return true;
        if (other == null || getClass() != other.getClass()) return false;
        Plugin plugin = (Plugin) other;
        return name.equals(plugin.name);
    }

    @Override
    public String identity() {
        return name;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, jarPath, type);
    }
}
