package org.neo4j.osgi.importer.repository;

import org.neo4j.osgi.importer.entity.Bundle;
import org.springframework.data.neo4j.repository.GraphRepository;

/**
 * @author <a href="mailto:justinrgriffin@gmail.com">Justin Griffin</a>
 * @since 0.0.1
 */
public interface BundleRepository extends GraphRepository<Bundle> {
}
