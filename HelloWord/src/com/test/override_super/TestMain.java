package com.test.override_super;

public class TestMain {
    public static void main(String[] args) {

        Test test = new Test();
        test.name = "test";
        test.testSoloName = "testSoloName";
        test.describe();
        test.testSoloDescribe();

        TestFather testF = new Test();
        testF.name = "test";
        testF.describe();
//        ((Test) testF).testSoloName = "testSoloName";
//        ((Test) testF).testSoloDescribe();
//        System.out.println(testF.testSoloName);

//        Test test = new TestFather();
    }
}
