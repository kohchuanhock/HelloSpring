package com.events;

import org.springframework.context.ApplicationListener;

/**
 * @author kohchuanhock on 23/9/14.
 */
public class CustomEventHandler implements ApplicationListener<CustomEvent> {
    public void onApplicationEvent(CustomEvent event) {
        System.out.println(event.toString());
    }

}
