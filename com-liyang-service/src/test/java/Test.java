import java.util.HashMap;
import java.util.Map;

/**
 * Created by liyang21 on 2017/10/9.
 */
public class Test {
    public  static Map<String,String> m=new HashMap(){
        {
            put("a","2");
        }
    };

    public static void main(String[] args) {
        Integer isInt = Integer.valueOf(m.get("a"));
        System.out.println(isInt);

        Integer s=223;
        Integer b=223;
        System.out.println(s==b);
        s=100;b=100;
        System.out.println(s==b);
    }
}
