package uz.pdp.pcmarket.projection;

import org.springframework.data.rest.core.config.Projection;
import uz.pdp.pcmarket.entitiy.Details;

@Projection(types = Details.class)
public interface DetailsCustom {
    Integer getId();

    String getName();
}
