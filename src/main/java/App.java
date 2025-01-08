import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);
        HelloWorld bean =
                (HelloWorld) applicationContext.getBean("helloworld");
        System.out.println(bean.getMessage());
        HelloWorld beanTwo =
                (HelloWorld) applicationContext.getBean("helloworld");
        Cat cat = (Cat) applicationContext.getBean("cat");
        Cat catTwo = (Cat) applicationContext.getBean("cat");
        System.out.println("Are helloWorld's beans equals? - " + (bean == beanTwo));
        System.out.println("Are cat's beans equals? - " + (cat == catTwo));
    }
}