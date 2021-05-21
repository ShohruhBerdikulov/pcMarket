package uz.pdp.pcmarket.projection;

import org.springframework.data.rest.core.config.Projection;
import uz.pdp.pcmarket.entitiy.Attachment;
import uz.pdp.pcmarket.entitiy.Category;
import uz.pdp.pcmarket.entitiy.Details;
import uz.pdp.pcmarket.entitiy.Product;

@Projection(types = Character.class)
public interface CharactersCustom {
    Integer getId();

    Details getDetails();

    Integer getValue();

    Product getProduct();
}
