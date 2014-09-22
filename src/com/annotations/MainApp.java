package com.annotations;

import org.junit.Test;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author kohchuanhock on 20/9/14.
 */
public class MainApp {
    @Test
    public void testRequired() {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("annotationBeans.xml");
        Student student = (Student) context.getBean("student");
        System.out.println("Name : " + student.getName() );
        System.out.println("Age : " + student.getAge() );
    }

    @Test
    public void testAutoWiredSetter() {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("annotationBeans.xml");
        TextEditorAutoWiredSetter te = (TextEditorAutoWiredSetter) context.getBean("textEditorAutoWiredSetter");
        te.spellCheck();
    }

    @Test
    public void testAutoWiredProperties() {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("annotationBeans.xml");
        TextEditorAutoWiredProperties te = (TextEditorAutoWiredProperties) context.getBean("textEditorAutoWiredProperties");
        te.spellCheck();
    }

    @Test
    public void testAutoWiredConstructor() {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("annotationBeans.xml");
        TextEditorAutoWiredConstructor te = (TextEditorAutoWiredConstructor) context.getBean("textEditorAutoWiredConstructor");
        te.spellCheck();
    }

    @Test
    public void testQualifier() {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("annotationBeans.xml");
        Profile profile = (Profile) context.getBean("profile");
        profile.printAge();
        profile.printName();
    }

    @Test
    public void testPreDestroyPostConstruct() {
        AbstractApplicationContext context = new ClassPathXmlApplicationContext("annotationBeans.xml");
        HelloWorld obj = (HelloWorld) context.getBean("helloWorld");
        obj.getMessage();
        context.registerShutdownHook();
    }

    @Test
    public void testResource() {
        AbstractApplicationContext context = new ClassPathXmlApplicationContext("annotationBeans.xml");
        TextEditorResource obj = (TextEditorResource) context.getBean("textEditorResource");
        obj.spellCheck();
        context.registerShutdownHook();
    }

}
