package com.javabased;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

/**
 * @author kohchuanhock on 22/9/14.
 */
public class MainApp {
    @Test
    public void testJavaBasedConfig() {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(HelloWorldConfig.class);
        HelloWorld helloWorld = ctx.getBean(HelloWorld.class);
        helloWorld.setMessage("Hello World!");
        helloWorld.getMessage();
    }

    @Test
    public void testTextEditor() {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(TextEditorConfig.class);
        TextEditor te = ctx.getBean(TextEditor.class);
        te.spellCheck();
    }

    @Test
    public void testImport() {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(BConfig.class);
        // now both beans A and B will be available...
        A a = ctx.getBean(A.class);
        B b = ctx.getBean(B.class);
    }

    @Test
    public void testFoo() {
        AbstractApplicationContext ctx = new AnnotationConfigApplicationContext(FooConfig.class);
        Foo foo = ctx.getBean(Foo.class);
        if (foo != null) System.out.println("here");
        ctx.registerShutdownHook();
    }
}
