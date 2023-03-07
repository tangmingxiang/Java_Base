package com.test.override_super;

public class Test extends TestFather{
    public String name;
    public String testSoloName;

    public void describe() {
        System.out.println("子类 describe " + this.name + super.name);
        super.describe();
    }

    public void testSoloDescribe() {
        System.out.println("子类独有的方法");
    }
    //    public TestFather getFather() {
    //        return super;
    //    }
}
