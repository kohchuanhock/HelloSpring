package com.javabased;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * @author kohchuanhock on 22/9/14.
 */
@Configuration
@Import(AConfig.class)
public class BConfig {
    @Bean
    public B b() {
        return new B();
    }
}
