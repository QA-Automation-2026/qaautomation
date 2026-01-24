package com.git.Package;

public class methodsTest {

    public static void main(String[] args) {

        methodsTest t1 = new methodsTest ();
        t1.test1();
        t1.test2();
        test3();
    }

    public void test1(){
        System.out.println("test1");
    }
    public void test2(){
        System.out.println("test2");
    }
    public static void  test3(){
        System.out.println("test3");
    }
    public methodsTest () {
        System.out.println("constructor");

    }

}
