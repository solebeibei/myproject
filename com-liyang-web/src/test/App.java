import com.liyang.web.service.MessageService;
import com.liyang.web.service.demo.Aservice;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {

        // 用我们的配置文件来启动一个 ApplicationContext
        ApplicationContext context = new ClassPathXmlApplicationContext("classpath:spring-config1.xml");

        System.out.println("context 启动成功");

        // 从 context 中取出我们的 Bean，而不是用 new MessageServiceImpl() 这种方式
        Aservice messageService = context.getBean(Aservice.class);
        // 这句将输出: hello world
        messageService.barA();

        System.out.println(3|9);
    }
}
