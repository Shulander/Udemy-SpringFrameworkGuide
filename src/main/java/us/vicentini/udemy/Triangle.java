package us.vicentini.udemy;

import java.util.List;
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

    private List<Point> points;

    public void draw() {
        for (Point point : points) {
            log.info("Point: " + Objects.toString(point));
        }
    }
}
