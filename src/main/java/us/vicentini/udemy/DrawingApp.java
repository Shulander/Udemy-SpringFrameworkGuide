package us.vicentini.udemy;

    import org.springframework.beans.factory.BeanFactory;
    import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DrawingApp {

    public static void main(String[] args) {
//        Triangle triangle = new Triangle();
        BeanFactory factory = new ClassPathXmlApplicationContext("spring.xml");

        Triangle triangle = factory.getBean("triangle", Triangle.class);

        triangle.draw();
    }
}
