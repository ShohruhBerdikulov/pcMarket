package uz.pdp.pcmarket.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;
import uz.pdp.pcmarket.entitiy.Position;
import uz.pdp.pcmarket.projection.PositionCustom;

@Repository
@RepositoryRestResource(path = "Position", collectionResourceRel = "list", excerptProjection = PositionCustom.class)
public interface PositionRepository extends JpaRepository<Position, Integer> {
}
