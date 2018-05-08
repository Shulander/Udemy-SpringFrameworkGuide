package us.vicentini.udemy.event;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class MyEventListener implements ApplicationListener<DrawEvent> {

    @Override
    public void onApplicationEvent(DrawEvent event) {
        log.info("Event: " + event.toString());
    }
}
