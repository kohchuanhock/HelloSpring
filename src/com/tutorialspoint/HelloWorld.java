package com.tutorialspoint;

/**
 * @author kohchuanhock on 18/9/14.
 */
public class HelloWorld {
    private String message;
    private String message2;

    public void defaultInit() {
        System.out.println("default init");
    }

    public void defaultDestroy() {
        System.out.println("default destroy");
    }

    public void init() {
        System.out.println("init");
    }

    public void destroy() {
        System.out.println("destroy");
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public void setMessage2(String message) {
        this.message2 = message;
    }

    public String getMessage() {
        return message;
    }

    public String getMessage2() {
        return message2;
    }
}
