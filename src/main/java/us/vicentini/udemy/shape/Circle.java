package us.vicentini.udemy.shape;

import java.util.Objects;
import lombok.Getter;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Required;

@Slf4j
public class Circle implements Shape {

    @Getter
    private Point center;

    @Required
    public void setCenter(Point center) {
        this.center = center;
    }

    @Override
    public void draw() {
        log.info("Drawing a Circle");
        log.info("Circle: Center Point is: " + Objects.toString(center));
    }
}
