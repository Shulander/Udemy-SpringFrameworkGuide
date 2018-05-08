package us.vicentini.udemy;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import us.vicentini.udemy.shape.Shape;

class DrawingApp {

    public static void main(String[] args) {
        AbstractApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        context.registerShutdownHook();

        Shape shape = context.getBean("circle", Shape.class);
        shape.draw();
    }
}
