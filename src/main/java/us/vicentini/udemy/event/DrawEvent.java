package us.vicentini.udemy.event;

import org.springframework.context.ApplicationEvent;

public class DrawEvent extends ApplicationEvent {

    public DrawEvent(Object source) {
        super(source);
    }

    @Override
    public String toString() {
        return "DrawEvent{" + getSource().toString() + "}";
    }
}
