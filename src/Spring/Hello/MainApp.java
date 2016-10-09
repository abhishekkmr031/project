package Spring.Hello;

/**
 * Created by AB on 10/9/2016.
 */
    import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

    public class MainApp {
        public static void main(String[] args) {
            ApplicationContext context =
                    new ClassPathXmlApplicationContext("Beans.xml");

            HelloSpring obj = (HelloSpring) context.getBean("HelloSpring");

            obj.getMessage();
        }
    }

