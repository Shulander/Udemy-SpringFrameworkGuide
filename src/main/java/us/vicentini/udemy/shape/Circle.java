package us.vicentini.udemy.shape;

import java.util.Locale;
import java.util.Objects;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.ApplicationEventPublisherAware;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Component;
import us.vicentini.udemy.event.DrawEvent;

@Slf4j
@Component
public class Circle implements Shape, ApplicationEventPublisherAware {

    @Autowired
    @Qualifier("pointA")
    private Point center;

    @Autowired
    private MessageSource messageSource;

    private ApplicationEventPublisher eventPublisher;

    @Override
    public void draw() {
        log.info(messageSource.getMessage("circle.drawing", null, "circle.drawing", Locale.ENGLISH));
        log.info(toString());

        DrawEvent drawEvent = new DrawEvent(this);
        eventPublisher.publishEvent(drawEvent);
    }

    @Override
    public String toString() {
        return messageSource
            .getMessage("circle.center", new Object[]{Objects.toString(center)}, "circle.center", Locale.ENGLISH);
    }

    @Override
    public void setApplicationEventPublisher(ApplicationEventPublisher applicationEventPublisher) {
        this.eventPublisher = applicationEventPublisher;
    }
}
