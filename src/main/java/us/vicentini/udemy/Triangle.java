package us.vicentini.udemy;

import java.util.List;
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

    private List<Point> points;

    private ApplicationContext applicationContext = null;

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.applicationContext = applicationContext;
    }

    public void draw() {
        for (Point point : points) {
            log.info("Point: " + Objects.toString(point));
        }
    }

    @Override
    public void setBeanName(String name) {
        log.info("My bean name is: " + name);
    }

}
