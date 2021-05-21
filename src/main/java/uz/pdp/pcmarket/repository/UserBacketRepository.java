package uz.pdp.pcmarket.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;
import uz.pdp.pcmarket.entitiy.UserBacket;
import uz.pdp.pcmarket.entitiy.Users;
import uz.pdp.pcmarket.projection.UserBacketCustom;
import uz.pdp.pcmarket.projection.UserCustom;

@Repository
@RepositoryRestResource(path = "UserBacket", collectionResourceRel = "list", excerptProjection = UserBacketCustom.class)
public interface UserBacketRepository extends JpaRepository<UserBacket, Integer> {
}
