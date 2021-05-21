package uz.pdp.pcmarket.projection;

import org.springframework.data.rest.core.config.Projection;
import uz.pdp.pcmarket.entitiy.*;

@Projection(types = MyTeam.class)
public interface MyTeamCustom {
    Integer getId();

    String getFullName();

    Attachment getAttachment();

    Position getPosition();
}
