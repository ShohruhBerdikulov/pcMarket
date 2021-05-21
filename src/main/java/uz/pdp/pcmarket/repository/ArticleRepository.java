package uz.pdp.pcmarket.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;
import uz.pdp.pcmarket.entitiy.Article;
import uz.pdp.pcmarket.projection.ArticleCustom;

@Repository
@RepositoryRestResource(path = "Article", collectionResourceRel = "list", excerptProjection = ArticleCustom.class)
public interface ArticleRepository extends JpaRepository<Article, Integer> {
}
