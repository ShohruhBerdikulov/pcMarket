package uz.pdp.pcmarket.projection;

import org.springframework.data.rest.core.config.Projection;
import uz.pdp.pcmarket.entitiy.Position;

@Projection(types = Position.class)
public interface PositionCustom {
    Integer getId();

    String getName();
}
