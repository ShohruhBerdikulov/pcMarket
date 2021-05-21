package uz.pdp.pcmarket.projection;

import org.springframework.data.rest.core.config.Projection;
import uz.pdp.pcmarket.entitiy.Article;
import uz.pdp.pcmarket.entitiy.Attachment;
import uz.pdp.pcmarket.entitiy.Position;

@Projection(types = Article.class)
public interface ArticleCustom {
    Integer getId();

    String getTitle();

    String getDescription();

    String getUrlLink();

    Attachment getAttachment();
}
