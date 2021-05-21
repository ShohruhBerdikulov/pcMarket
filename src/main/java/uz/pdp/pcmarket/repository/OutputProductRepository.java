package uz.pdp.pcmarket.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;
import uz.pdp.pcmarket.entitiy.Order;
import uz.pdp.pcmarket.entitiy.OutputProduct;
import uz.pdp.pcmarket.projection.OutputProductCustom;

@Repository
@RepositoryRestResource(path = "OutputProduct", collectionResourceRel = "list", excerptProjection = OutputProductCustom.class)
public interface OutputProductRepository extends JpaRepository<OutputProduct, Integer> {
}
