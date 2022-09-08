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
    String prop3;
    String[] prop4;
    int prop5;
    boolean prop6;
    MyEnum prop7;
    String version;
    public MyEnum getProp7() {
        return prop7;
    }

    public void setProp7(MyEnum prop7) {
        this.prop7 = prop7;
    }

    public int getProp5() {
        return prop5;
    }

    public void setProp5(int prop5) {
        this.prop5 = prop5;
    }

    public boolean isProp6() {
        return prop6;
    }

    public void setProp6(boolean prop6) {
        this.prop6 = prop6;
    }

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

    public String[] getProp4() {
        return prop4;
    }

    public void setProp4(String[] prop4) {
        this.prop4 = prop4;
    }

    public String getProp3() {
        return prop3;
    }

    public void setProp3(String prop3) {
        this.prop3 = prop3;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }
}
