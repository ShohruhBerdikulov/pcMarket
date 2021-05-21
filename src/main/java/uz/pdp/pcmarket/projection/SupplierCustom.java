package uz.pdp.pcmarket.projection;

import org.springframework.data.rest.core.config.Projection;
import uz.pdp.pcmarket.entitiy.Attachment;
import uz.pdp.pcmarket.entitiy.Category;
import uz.pdp.pcmarket.entitiy.Product;
import uz.pdp.pcmarket.entitiy.Supplier;

@Projection(types = Supplier.class)
public interface SupplierCustom {

    Integer getId();

    String getFullName();

    String getEmail();

    String getPhoneNumber();

    String getMessageBody();


}
