package us.vicentini.udemy;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import us.vicentini.udemy.service.ShapeService;

@Slf4j
class DrawingApp {

    public static void main(String[] args) {
        AbstractApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        context.registerShutdownHook();

        ShapeService shapeService = context.getBean("shapeService", ShapeService.class);
        log.info(shapeService.getCircle().getName());
        shapeService.getCircle().setNameAndReturn("NewName");
        log.info(shapeService.getTriangle().getName());
    }
}
