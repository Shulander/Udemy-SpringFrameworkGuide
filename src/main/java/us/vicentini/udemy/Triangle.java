package us.vicentini.udemy;

import java.util.Objects;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

@Getter
@Setter
@Slf4j
@ToString
public class Triangle implements ApplicationContextAware, BeanNameAware {

    private Point pointA;
    private Point pointB;
    private Point pointC;

    private ApplicationContext applicationContext = null;

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.applicationContext = applicationContext;
    }

    public void draw() {
        log.info("Point A: " + Objects.toString(pointA));
        log.info("Point B: " + Objects.toString(pointB));
        log.info("Point C: " + Objects.toString(pointC));
    }

    @Override
    public void setBeanName(String name) {
        log.info("My bean name is: " + name);
    }
}
