package uz.pdp.pcmarket.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;
import uz.pdp.pcmarket.entitiy.Details;
import uz.pdp.pcmarket.projection.DetailsCustom;

@Repository
@RepositoryRestResource(path = "Details", collectionResourceRel = "list", excerptProjection = DetailsCustom.class)
public interface DetailsRepository extends JpaRepository<Details, Integer> {
}
