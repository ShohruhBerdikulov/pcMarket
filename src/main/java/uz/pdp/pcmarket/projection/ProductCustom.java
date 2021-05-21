package uz.pdp.pcmarket.projection;

import org.springframework.data.rest.core.config.Projection;
import uz.pdp.pcmarket.entitiy.Attachment;
import uz.pdp.pcmarket.entitiy.Category;
import uz.pdp.pcmarket.entitiy.OutputProduct;
import uz.pdp.pcmarket.entitiy.Product;

@Projection(types = Product.class)
public interface ProductCustom {
    Integer getId();

    String getModelName();

    Integer getPrice();

    Category getCategory();

    boolean getActive();

    Attachment getAttachment();
}
