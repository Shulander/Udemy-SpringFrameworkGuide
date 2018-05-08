package us.vicentini.udemy;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import us.vicentini.udemy.shape.Shape;

class DrawingApp {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");

        Shape shape = context.getBean("circle", Shape.class);
        shape.draw();
    }

}
