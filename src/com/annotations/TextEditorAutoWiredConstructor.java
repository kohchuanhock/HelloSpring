package com.annotations;

import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author kohchuanhock on 20/9/14.
 */
public class TextEditorAutoWiredConstructor {
    private SpellChecker spellChecker;
    @Autowired
    public TextEditorAutoWiredConstructor(SpellChecker spellChecker){
        System.out.println("Inside TextEditor constructor." );
        this.spellChecker = spellChecker;
    }

    public void spellCheck(){
        spellChecker.checkSpelling();
    }

}
