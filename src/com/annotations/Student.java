package com.annotations;

import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author kohchuanhock on 20/9/14.
 */
public class Student {
    private Integer age;
    private String name;

    @Autowired(required=false)
    public void setAge(Integer age) {
        this.age = age;
    }

    public Integer getAge() {
        return age;
    }

    @Autowired
    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
