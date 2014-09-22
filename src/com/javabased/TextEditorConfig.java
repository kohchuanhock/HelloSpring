package com.javabased;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author kohchuanhock on 22/9/14.
 */

@Configuration
public class TextEditorConfig {
    @Bean
    public TextEditor textEditor(){
        return new TextEditor( spellChecker() );
    }
    @Bean
    public SpellChecker spellChecker(){
        return new SpellChecker( );
    }
}
