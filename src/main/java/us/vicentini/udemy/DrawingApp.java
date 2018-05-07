package us.vicentini.udemy;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import us.vicentini.udemy.shape.Triangle;

class DrawingApp {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");

        Triangle triangle = context.getBean("triangle", Triangle.class);
        triangle.draw();
    }
}
