package us.vicentini.udemy.shape;

import java.util.Locale;
import java.util.Objects;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class Circle implements Shape {

    @Autowired
    @Qualifier("pointA")
    private Point center;

    @Autowired
    private MessageSource messageSource;

    @Override
    public void draw() {
        log.info(messageSource.getMessage("circle.drawing", null, "circle.drawing", Locale.ENGLISH));
        log.info(messageSource
            .getMessage("circle.center", new Object[]{Objects.toString(center)}, "circle.center", Locale.ENGLISH));
    }
}
