package com.javabased;

/**
 * @author kohchuanhock on 22/9/14.
 */
public class HelloWorld {
    private String message;
    public void setMessage(String message){
        this.message = message;
    }
    public void getMessage(){
        System.out.println("Your Message : " + message);
    }
}
