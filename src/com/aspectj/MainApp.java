package com.aspectj;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author kohchuanhock on 23/9/14.
 */
public class MainApp {
    @Test
    public void test() {
        ApplicationContext context =
                new ClassPathXmlApplicationContext("aspectjBeans.xml");
        Student student = (Student) context.getBean("student");
        student.getName();
        student.getAge();

        student.printThrowException();
    }
}
