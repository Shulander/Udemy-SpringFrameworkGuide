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
    private String name;

    @Autowired
    @Qualifier("pointA")
    private Point center;

    public void setName(String name) {
        this.name = name;
        log.info("Circle's setter called");
    }

    @Override
    public void draw() {
        log.info("Drawing a Circle");
        log.info(toString());
        throw new RuntimeException("error during setter");
    }

    public String setNameAndReturn(String name) {
        this.name = name;
        log.info("Set New Name: "+name);
        return name;
    }

    @Override
    public String toString() {
        return String.format("Circle: Center Point is: %s", Objects.toString(center));
    }

}
