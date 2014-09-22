package com.annotations;

import javax.annotation.Resource;

/**
 * @author kohchuanhock on 22/9/14.
 */
public class TextEditorResource {
    private SpellChecker spellChecker;
    @Resource(name= "spellChecker2")
    public void setSpellChecker( SpellChecker spellChecker ){
        this.spellChecker = spellChecker;
    }
    public SpellChecker getSpellChecker(){
        return spellChecker;
    }
    public void spellCheck() {
        spellChecker.checkSpelling();
    }
}
