package us.vicentini.udemy;

import java.util.Objects;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

@Getter
@Slf4j
@ToString
public class Triangle implements BeanNameAware, InitializingBean, DisposableBean {

    @Setter
    private Point pointA;
    @Setter
    private Point pointB;
    @Setter
    private Point pointC;

    private String beanName;


    public void draw() {
        log.info("Point A: " + Objects.toString(pointA));
        log.info("Point B: " + Objects.toString(pointB));
        log.info("Point C: " + Objects.toString(pointC));
    }

    @Override
    public void setBeanName(String name) {
        log.info("My bean name is: " + name);
        this.beanName = name;
    }

    public void init() throws Exception {
        log.info(String.format("My Initializing Bean: init method called for Triangle(%s)", beanName));
    }

    public void cleanUp() throws Exception {
        log.info(String.format("My Destroying Bean: destroy method called for Triangle(%s)", beanName));
    }

    @Override
    public void destroy() throws Exception {
        log.info(String.format("Destroying Bean: destroy method called for Triangle(%s)", beanName));
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        log.info(String.format("Initializing Bean: init method called for Triangle(%s)", beanName));
    }
}
