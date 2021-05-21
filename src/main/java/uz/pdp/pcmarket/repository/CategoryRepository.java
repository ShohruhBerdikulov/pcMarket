package uz.pdp.pcmarket.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;
import uz.pdp.pcmarket.entitiy.Category;
import uz.pdp.pcmarket.projection.CategoryCustom;

@Repository
@RepositoryRestResource(path = "Category", collectionResourceRel = "list", excerptProjection = CategoryCustom.class)
public interface CategoryRepository extends JpaRepository<Category, Integer> {
}
