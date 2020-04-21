package dhbwka.wwi.vertsys.rest.zoo;

import dhbwka.wwi.vertsys.rest.zoo.Tier;
import java.util.List;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

// Spring Data Repository für die Tier-Entität.

@RepositoryRestResource(collectionResourceRel = "tiere", path = "tiere")
public interface TierRepository extends PagingAndSortingRepository<Tier, Long> {
	
	// Zugriffsmethoden
	List<Tier> findByName(@Param("name") String name);
	List<Tier> findByKlasse(@Param("klasse") String klasse);
	List<Tier> findByGefaehrdung(@Param("gefaehrdung") String gefaehrdung);
	
}
