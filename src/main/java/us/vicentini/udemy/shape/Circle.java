package us.vicentini.udemy.shape;

import java.util.Objects;
import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.annotation.Resource;
import lombok.Getter;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Circle implements Shape {

    @Getter
    @Setter
    @Resource(name = "pointA")
    private Point center;

    @Override
    public void draw() {
        log.info("Drawing a Circle");
        log.info("Circle: Center Point is: " + Objects.toString(center));
    }

    @PostConstruct
    public void initCircle() {
        log.info("Initializing using annotation");
    }

    @PreDestroy
    public void destroyCircle() {
        log.info("Destroying using annotation");
    }
}
