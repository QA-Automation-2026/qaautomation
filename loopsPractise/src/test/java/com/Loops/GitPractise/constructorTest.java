package com.Loops.GitPractise;

public class constructorTest {
    static int i = 10;
    public static void main(String[] args) {
        constructorTest cT1 = new constructorTest();
        System.out.println(cT1.i +" class using object creation");
    }
    public constructorTest ()
    {
        System.out.println("Explicit Constructor");
    }
}
