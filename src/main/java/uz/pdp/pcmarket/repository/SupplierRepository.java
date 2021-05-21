package uz.pdp.pcmarket.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;
import uz.pdp.pcmarket.entitiy.Supplier;
import uz.pdp.pcmarket.projection.SupplierCustom;

@Repository
@RepositoryRestResource(path = "Supplier", collectionResourceRel = "list", excerptProjection = SupplierCustom.class)
public interface SupplierRepository extends JpaRepository<Supplier, Integer> {
}
