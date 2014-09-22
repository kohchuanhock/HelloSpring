package com.annotations;

import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author kohchuanhock on 20/9/14.
 */
public class TextEditorAutoWiredProperties {
    @Autowired
    private SpellChecker spellChecker;

    public SpellChecker getSpellChecker( ) {
        return spellChecker;
    }

    public void spellCheck() {
        spellChecker.checkSpelling();
    }
}
