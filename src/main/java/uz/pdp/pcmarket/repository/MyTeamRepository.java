package uz.pdp.pcmarket.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;
import uz.pdp.pcmarket.entitiy.MyTeam;
import uz.pdp.pcmarket.projection.MyTeamCustom;

@Repository
@RepositoryRestResource(path = "MyTeam", collectionResourceRel = "list", excerptProjection = MyTeamCustom.class)
public interface MyTeamRepository extends JpaRepository<MyTeam, Integer> {
}
