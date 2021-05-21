package uz.pdp.pcmarket.projection;

import org.springframework.data.rest.core.config.Projection;
import uz.pdp.pcmarket.entitiy.Comments;
import uz.pdp.pcmarket.entitiy.Details;
import uz.pdp.pcmarket.entitiy.Product;
import uz.pdp.pcmarket.entitiy.Users;

@Projection(types = Comments.class)
public interface CommentsCustom {
    Integer getId();

    String getBody();

    String getEmail();

    String getPassword();

    Users getUsers();
}
