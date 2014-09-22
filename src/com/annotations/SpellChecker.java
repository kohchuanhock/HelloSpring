package com.annotations;

/**
 * @author kohchuanhock on 20/9/14.
 */
public class SpellChecker {
    private String name = "Default SpellChecker";
    public SpellChecker(){
        System.out.println("Inside SpellChecker constructor." );
    }
    public void checkSpelling(){
        System.out.println(name + " Inside checkSpelling." );
    }
    public void setName(String name) { this.name = name; }
}
