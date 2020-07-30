import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import pojo.User;
import pojo.UserT;

public class Mytest {
    public static void main(String[] args) {
        ApplicationContext Context = new ClassPathXmlApplicationContext("applicationContext.xml");
        User user = (User) Context.getBean("user");
        user.show();

    }
}
