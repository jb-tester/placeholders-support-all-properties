package com.mytests.springboot.placeholders.supportAllProperties;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
@EnableConfigurationProperties
public class PlaceholdersSupportAllPropertiesApplication implements CommandLineRunner {

    @Autowired
    private MyProps myProps;

    public static void main(String[] args) {
        SpringApplication.run(PlaceholdersSupportAllPropertiesApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        System.out.println("*******************************");
        System.out.println(myProps.prop1);
        System.out.println(myProps.prop2);
        System.out.println(myProps.prop3);
        System.out.println("*******************************");
    }
}
