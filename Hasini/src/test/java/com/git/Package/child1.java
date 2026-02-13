package com.git.Package;

public class child1 extends  parent{

    public static void testchild()
    {

        System.out.println("child class");
    }
    public static void testchild(int a)
    {

        System.out.println("child class" + a);
    }

    public void test()
    {
        super.test();
        super.test4();
        System.out.println("child override class");
    }


    public static void main(String[] args) {
        child1.testchild(); // overload
        child1.testchild(10); // overload
        child1 c1 = new child1(); // child + parent methdos
        c1.test(); //override
        parent p1 = new child1(); // only parent methods


    }
}
