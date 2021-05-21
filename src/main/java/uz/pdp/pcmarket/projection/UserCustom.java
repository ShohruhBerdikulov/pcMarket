package uz.pdp.pcmarket.projection;

import org.springframework.data.rest.core.config.Projection;
import uz.pdp.pcmarket.entitiy.Attachment;
import uz.pdp.pcmarket.entitiy.OutputProduct;
import uz.pdp.pcmarket.entitiy.UserBacket;
import uz.pdp.pcmarket.entitiy.Users;

@Projection(types = Users.class)
public interface UserCustom {

    Integer getId();


    String getFullName();

    String getEmail();

    String getPassword();

    Attachment getAttachment();
}
