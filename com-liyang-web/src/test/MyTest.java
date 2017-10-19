import com.liyang.controller.index.IndexService;
import com.liyang.controller.order.OrderService;
import com.liyang.dao.ArticleMapper;
import com.liyang.model.Article;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

/**
 * Created by liyang21 on 2017/9/18.
 */

@RunWith(SpringJUnit4ClassRunner.class)
@WebAppConfiguration
@ContextConfiguration("/spring-config1.xml")
public class MyTest {
    @Autowired
    private ArticleMapper articleMapper;

    @Autowired
    private OrderService orderService;
    @Test
    public void testPayFina() throws Exception {
        Article article = new Article();
        article.setId(20003);
        article.setCategoryId(20003);
        article.setName("20003");
       // int result = articleMapper.insert(article);
        int result=orderService.insertOrder(article);
        System.out.println(
                result
        );
    }
}
