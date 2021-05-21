package uz.pdp.pcmarket.projection;

import org.springframework.data.rest.core.config.Projection;
import uz.pdp.pcmarket.entitiy.Comments;
import uz.pdp.pcmarket.entitiy.OutputProduct;
import uz.pdp.pcmarket.entitiy.Product;
import uz.pdp.pcmarket.entitiy.Users;

@Projection(types = OutputProduct.class)
public interface OutputProductCustom {
    Integer getId();

    Product getProduct();

    Integer getAmount();
}
