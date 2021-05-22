package uz.pdp.pcmarket.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.stereotype.Repository;
import uz.pdp.pcmarket.entitiy.Product;
import uz.pdp.pcmarket.projection.ProductCustom;

@Repository
@RepositoryRestResource(path = "Product", collectionResourceRel = "list", excerptProjection = ProductCustom.class)
public interface ProductRepository extends JpaRepository<Product, Integer> {
//    @P
//    <S extends Product> S save(S entity);
}
