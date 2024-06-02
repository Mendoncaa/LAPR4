package core.management.Plugin.repository;

import core.management.Plugin.domain.Plugin;
import core.management.Plugin.domain.PluginType;
import eapli.framework.domain.repositories.DomainRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface PluginRepository extends DomainRepository<String, Plugin> {

}
