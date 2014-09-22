package com.javabased;

/**
 * @author kohchuanhock on 22/9/14.
 */
public class TextEditor {
    private SpellChecker spellChecker;
    public TextEditor(SpellChecker spellChecker){
        System.out.println("Inside TextEditor constructor." );
        this.spellChecker = spellChecker;
    }
    public void spellCheck(){
        spellChecker.checkSpelling();
    }
}
