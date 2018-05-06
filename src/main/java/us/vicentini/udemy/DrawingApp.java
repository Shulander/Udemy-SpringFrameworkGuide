package us.vicentini.udemy;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DrawingApp {

    public static void main(String[] args) {
//        Triangle triangle = new Triangle();
        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");

        Triangle triangle = context.getBean("triangle", Triangle.class);
        triangle.draw();
        System.out.println(triangle.getType());
    }
}
