package com.najus.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * Created by najus on 6/18/17.
 */

@Configuration
@EnableAutoConfiguration
@ComponentScan("com.najus.springboot")
public class WebAppInitializer {

    public static void main(String[] args) throws Exception{
        SpringApplication.run(WebAppInitializer.class, args);
    }
}
