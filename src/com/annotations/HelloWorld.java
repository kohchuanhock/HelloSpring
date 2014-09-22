package com.annotations;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * @author kohchuanhock on 22/9/14.
 */
public class HelloWorld {
    private String message;

    public HelloWorld() {
        System.out.println("Empty Constructor");
    }
    public void setMessage(String message){
        this.message = message;
    }
    public String getMessage(){
        System.out.println("Your Message : " + message);
        return message;
    }
    @PostConstruct
    public void init(){
        System.out.println("Bean is going through init.");
    }
    @PreDestroy
    public void destroy(){
        System.out.println("Bean will destroy now.");
    }

}
