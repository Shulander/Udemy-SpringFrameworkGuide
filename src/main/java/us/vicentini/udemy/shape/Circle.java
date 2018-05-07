package us.vicentini.udemy.shape;

import java.util.Objects;
import lombok.Getter;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;

@Getter
@Setter
@Slf4j
public class Circle implements Shape {

    private Point center;

    @Override
    public void draw() {
        log.info("Drawing a Circle");
        log.info("Circle: Center Point is: " + Objects.toString(center));
    }
}
