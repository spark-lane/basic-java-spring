package omsore.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class App {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring-config.xml");

//       Food obj1 = (Food) context.getBean("kachori");
//      obj1.eat();
//        
        Chutney t = (Chutney) context.getBean("chutney");
        System.out.println(t);
    }
}
