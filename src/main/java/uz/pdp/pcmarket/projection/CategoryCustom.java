package uz.pdp.pcmarket.projection;

import org.springframework.data.rest.core.config.Projection;
import uz.pdp.pcmarket.entitiy.Attachment;
import uz.pdp.pcmarket.entitiy.Category;

@Projection(types = Attachment.class)
public interface CategoryCustom {
    Integer getId();

    String getName();

    Category getCategory();
}
