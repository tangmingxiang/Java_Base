package com.test.override_super;

public class TestFather extends TestFatherF{
    public String name;
    public void describe() {
        System.out.println("父类 describe " + this.name);
    }
}
