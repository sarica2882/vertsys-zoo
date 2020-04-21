package dhbwka.wwi.vertsys.rest.zoo;

import dhbwka.wwi.vertsys.rest.zoo.Zoo;
import java.util.List;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;



// Spring Data Repository für die Zoo-Entität.
@RepositoryRestResource(collectionResourceRel = "zoos", path = "zoos")
public interface ZooRepository extends PagingAndSortingRepository<Zoo, Long> {
	
	// Zugriffsmethoden
	List<Zoo> findByName(@Param("name") String name);
	List<Zoo> findById(@Param("id") long id);
}
