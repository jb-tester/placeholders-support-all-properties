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
        System.out.println(myProps.getProp1());
        System.out.println(myProps.getProp2());
        System.out.println(myProps.getProp3());
        System.out.println(myProps.getProp4()[0]);
        System.out.println(myProps.getProp4()[1]);
        System.out.println(myProps.getProp5());
        System.out.println(myProps.isProp6());
        System.out.println(myProps.version);
        System.out.println("*******************************");
    }
}
