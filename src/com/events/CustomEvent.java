package com.events;

import org.springframework.context.ApplicationEvent;

/**
 * @author kohchuanhock on 23/9/14.
 */
public class CustomEvent extends ApplicationEvent {
    public CustomEvent(Object source) {
        super(source);
    }
    public String toString(){
        return "My Custom Event";
    }

}
