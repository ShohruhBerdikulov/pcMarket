package uz.pdp.pcmarket.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;
import uz.pdp.pcmarket.entitiy.Users;
import uz.pdp.pcmarket.projection.UserCustom;

@Repository
@RepositoryRestResource(path = "User", collectionResourceRel = "list", excerptProjection = UserCustom.class)
public interface UsersRepository extends JpaRepository<Users, Integer> {
}
