package com.mytests.springboot.placeholders.supportAllProperties;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * *******************************
 * Created by Irina.Petrovskaya on 6/7/2018.
 * Project: placeholders-support-all-properties
 * *******************************
 */
@Component
@ConfigurationProperties(prefix = "myprops")
public class MyProps {
    String prop1;
    String prop2;

    public String getProp1() {
        return prop1;
    }

    public void setProp1(String prop1) {
        this.prop1 = prop1;
    }

    public String getProp2() {
        return prop2;
    }

    public void setProp2(String prop2) {
        this.prop2 = prop2;
    }
}
