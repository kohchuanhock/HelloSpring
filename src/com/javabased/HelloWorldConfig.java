package com.javabased;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author kohchuanhock on 22/9/14.
 *
 * This class is equivalent to
 * <beans>
 *     <bean id="helloWorld" class="com.tutorialspoint.HelloWorld" />
 *     </beans>
 */

@Configuration
public class HelloWorldConfig {
    @Bean
    public HelloWorld helloWorld(){
        return new HelloWorld();
    }
}
