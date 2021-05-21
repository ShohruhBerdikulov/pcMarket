package uz.pdp.pcmarket.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;
import uz.pdp.pcmarket.entitiy.Comments;
import uz.pdp.pcmarket.projection.CommentsCustom;

@Repository
@RepositoryRestResource(path = "Comments", collectionResourceRel = "list", excerptProjection = CommentsCustom.class)
public interface CommentsRepository extends JpaRepository<Comments, Integer> {
}
