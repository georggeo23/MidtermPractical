package sheridan.georggeo.midtermpractical.data.jpa;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
@RepositoryRestResource(
        path = "actors",
        collectionResourceRel = "actors",
        itemResourceRel = "actor"
)
public interface ActorRepository extends JpaRepository<Actor, Long> {
}
