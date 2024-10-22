import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);
        
        HelloWorld bean = (HelloWorld) applicationContext.getBean("helloworld");
        HelloWorld bean_two = (HelloWorld) applicationContext.getBean("helloworld");

        Cat cat = (Cat) applicationContext.getBean("cat");
        Cat cat_two = (Cat) applicationContext.getBean("cat");
        
        System.out.println(bean.equals(bean_two));
        System.out.println(cat.equals(cat_two));
    }
}