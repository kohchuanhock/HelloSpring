package com.events;

import org.junit.Test;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author kohchuanhock on 23/9/14.
 */
public class MainApp {
    @Test
    public void testStartStopEvent() {
        ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("eventBeans.xml");
        // Let us raise a start event.
        context.start();

        HelloWorld obj = (HelloWorld) context.getBean("helloWorld");
        obj.getMessage();
        // Let us raise a stop event.
        context.stop();
    }

    @Test
    public void testCustomEvent() {
        ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("eventBeans.xml");
        CustomEventPublisher cvp = (CustomEventPublisher) context.getBean("customEventPublisher");
        cvp.publish();
        cvp.publish();
    }
}
