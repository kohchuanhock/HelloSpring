package com.annotations;

import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author kohchuanhock on 20/9/14.
 */
public class TextEditorAutoWiredSetter {
    private SpellChecker spellChecker;

    @Autowired
    public void setSpellChecker( SpellChecker spellChecker ){
        this.spellChecker = spellChecker;
    }

    public SpellChecker getSpellChecker( ) {
        return spellChecker;
    }

    public void spellCheck() {
        spellChecker.checkSpelling();
    }
}
