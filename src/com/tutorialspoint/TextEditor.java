package com.tutorialspoint;

/**
 * @author kohchuanhock on 20/9/14.
 */
public class TextEditor {
    private SpellChecker spellChecker;

    public TextEditor() {
        // *** Do nothing
    }

    public TextEditor(SpellChecker spellChecker) {
        System.out.println("Inside TextEditor constructor." );
        this.spellChecker = spellChecker;
    }

    public void spellCheck() {
        spellChecker.checkSpelling();
    }

    // *** a setter method to inject the dependency.
    public void setSpellChecker(SpellChecker spellChecker) {
        System.out.println("Inside setSpellChecker." );
        this.spellChecker = spellChecker;
    }

    // *** a getter method to return spellChecker
    public SpellChecker getSpellChecker() {
        return spellChecker;
    }
}

