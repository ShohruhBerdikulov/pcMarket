package uz.pdp.pcmarket.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;
import uz.pdp.pcmarket.entitiy.Characters;
import uz.pdp.pcmarket.projection.CharactersCustom;

@Repository
@RepositoryRestResource(path = "Characters", collectionResourceRel = "list", excerptProjection = CharactersCustom.class)
public interface CharactersRepository extends JpaRepository<Characters, Integer> {
}
