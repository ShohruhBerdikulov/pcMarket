package uz.pdp.pcmarket.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;
import uz.pdp.pcmarket.entitiy.Order;
import uz.pdp.pcmarket.projection.OrderCustom;

@Repository
@RepositoryRestResource(path = "Order", collectionResourceRel = "list", excerptProjection = OrderCustom.class)
public interface OrderRepository extends JpaRepository<Order, Integer> {
}
