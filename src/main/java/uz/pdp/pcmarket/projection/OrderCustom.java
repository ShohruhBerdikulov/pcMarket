package uz.pdp.pcmarket.projection;

import org.springframework.data.rest.core.config.Projection;
import uz.pdp.pcmarket.entitiy.*;

import java.sql.Date;

@Projection(types = Order.class)
public interface OrderCustom {
    Integer getId();

    Date getDate();

    UserBacket getUserBacket();

    Details getDetails();
}
