package org.example;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Configuration
@ComponentScan
public class Appconfig {
    public void demo(){
        System.out.println("demo");
    }
}
