package com.javabased;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Scope;

/**
 * @author kohchuanhock on 22/9/14.
 */
public class FooConfig {
    @Bean(initMethod = "init", destroyMethod = "cleanup" )
    @Scope("prototype") // *** default is singleton
    public Foo foo() {
        return new Foo();
    }
}
