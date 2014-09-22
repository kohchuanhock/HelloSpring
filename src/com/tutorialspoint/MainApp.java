package com.tutorialspoint;

import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import static org.junit.Assert.assertTrue;

/**
 * @author kohchuanhock on 18/9/14.
 */
public class MainApp {

    @Test
    public void test() {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");

        // *** Basics
        final HelloWorld obj = (HelloWorld) context.getBean("helloWorld");
        assertTrue(obj.getMessage().equals("Hello World2!"));
        assertTrue(obj.getMessage2().equals("Hello!!"));

        // *** Singleton
        final HelloWorld obj2 = (HelloWorld) context.getBean("singleton");
        assertTrue(obj2.getMessage().equals("singleton"));
        obj2.setMessage("Still singleton");
        assertTrue(obj2.getMessage().equals("Still singleton"));
        final HelloWorld obj3 = (HelloWorld) context.getBean("singleton");
        assertTrue(obj3.getMessage().equals("Still singleton"));
        obj3.setMessage("Set to singleton");
        assertTrue(obj2.getMessage().equals("Set to singleton"));

        // *** Prototype
        final HelloWorld obj4 = (HelloWorld) context.getBean("prototype");
        assertTrue(obj4.getMessage().equals("prototype"));
        obj4.setMessage("obj4 prototype");
        final HelloWorld obj5 = (HelloWorld) context.getBean("prototype");
        assertTrue(obj5.getMessage().equals("prototype"));
        obj5.setMessage("obj5 prototype");
        assertTrue(obj4.getMessage().equals("obj4 prototype"));

        // *** Inheritance
        final HelloIndia obj6 = (HelloIndia) context.getBean("helloIndia");
        assertTrue(obj6.getMessage().equals("Hello World2!"));
        assertTrue(obj6.getMessage2().equals("Hello India"));
        assertTrue(obj6.getMessage3().equals("Hello India3"));

        context.close();
    }

    @Test
    public void testConstructorDependencyInjection() {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        TextEditor te = (TextEditor) context.getBean("textEditor");
        te.spellCheck();
        context.close();
    }

    @Test
    public void testSetterDependencyInjection() {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        TextEditor te = (TextEditor) context.getBean("setterTextEditor");
        te.spellCheck();
        context.close();
    }

    @Test
    public void testInnerBeanDependencyInjection() {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        TextEditor te = (TextEditor) context.getBean("innerBeanTextEditor");
        te.spellCheck();
        context.close();
    }

    @Test
    public void testCollectionInjection() {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        JavaCollection jc = (JavaCollection) context.getBean("javaCollection");
        jc.getAddressList();
        jc.getAddressSet();
        jc.getAddressMap();
        jc.getAddressProp();
    }

    @Test
    public void testEmptyAndNullString() {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        ExampleBean exampleBean = (ExampleBean) context.getBean("exampleBean");
        assertTrue(exampleBean.getEmail().length() == 0);
        assertTrue(exampleBean.getEmail2() == null);
    }
}
