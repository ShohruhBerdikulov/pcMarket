package uz.pdp.pcmarket.projection;

import org.springframework.data.rest.core.config.Projection;
import uz.pdp.pcmarket.entitiy.OutputProduct;
import uz.pdp.pcmarket.entitiy.Supplier;
import uz.pdp.pcmarket.entitiy.UserBacket;
import uz.pdp.pcmarket.entitiy.Users;

@Projection(types = UserBacket.class)
public interface UserBacketCustom {

    Integer getId();

    Integer getAllSum();

    Users getUsers();

    OutputProduct getOutputProduct();
}
