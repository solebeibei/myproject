import com.liyang.dao.Article;
import com.liyang.dao.ArticleMapper;
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

    @Test
    public void testPayFina() throws Exception {
        Article article = new Article();
        article.setId(2222);
        article.setCategoryId(2342);
        article.setName("dddddd111");
        int result = articleMapper.insert(article);
        System.out.println(
                result
        );
    }
}
