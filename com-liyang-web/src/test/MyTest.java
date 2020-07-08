import com.liyang.dao.ArticleMapper;
import com.liyang.model.Article;
import com.liyang.web.service.demo.Aservice;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
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
//    @Autowired
//    private ArticleMapper articleMapper;
//
//    @Test
//    public void testPayFina() throws Exception {
//        Article article = new Article();
//        article.setId(2222);
//        article.setCategoryId(2342);
//        article.setName("dddddd111");
//        int result = articleMapper.insert(article);
//        System.out.println(
//                result
//        );
//    }
    @Test
    public  void  hello(){
        System.out.println("111");
    }

    @Autowired
    private Aservice aservice;
    @Test
    public  void  testGetBean(){

        aservice.fooA("123");
    }
}
