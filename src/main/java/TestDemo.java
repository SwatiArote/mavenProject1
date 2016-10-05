import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


/**
 * Created by swati on 5/10/16.
 */



public class TestDemo {

    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
        TestClass1 obj = (TestClass1) context.getBean("testclass1");
        obj.printMsg();
        System.out.println("Hashcode of object1 = "+obj.hashCode());
        TestClass1 obj1 = (TestClass1) context.getBean("testclass1");
        obj1.printMsg();
        System.out.println("Hashcode of object2 = "+obj1.hashCode());
        WelcomeClass ob2 = (WelcomeClass) context.getBean("welcomeClass");
        ob2.welcomeMsg();
    }

}
