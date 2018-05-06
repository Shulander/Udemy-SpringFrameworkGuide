package us.vicentini.udemy;

import java.util.Objects;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.extern.slf4j.Slf4j;

@Getter
@Setter
@Slf4j
@ToString
public class Triangle {

    private Point pointA;
    private Point pointB;
    private Point pointC;

    public void draw() {
        log.info("Point A: " + Objects.toString(pointA));
        log.info("Point B: " + Objects.toString(pointB));
        log.info("Point C: " + Objects.toString(pointC));
    }
}
