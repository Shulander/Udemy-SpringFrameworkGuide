package us.vicentini.udemy.shape;

import java.util.Objects;
import lombok.Getter;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

@Slf4j
public class Circle implements Shape {

    @Getter
    @Setter
    @Autowired
    @Qualifier("centerRelated")
    private Point center;

    @Override
    public void draw() {
        log.info("Drawing a Circle");
        log.info("Circle: Center Point is: " + Objects.toString(center));
    }
}
