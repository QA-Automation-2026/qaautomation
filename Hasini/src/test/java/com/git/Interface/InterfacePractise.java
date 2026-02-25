package com.git.Interface;

public interface InterfacePractise {

    abstract void testm1();
    abstract void testm2();
    public static void testm3()
    {
        System.out.println("Interface testm3 static method");
    }

}


/*
* Interface - abstract method can be only declared
* Interface - static method can be defined
* normal class implements an interface -all the abstract methods should be defined
* abstract class implements an interface - abstract methods may/may not be defined
* class extends an abstract class which is implementing an interface - then all remaining abstract methods should be defined
*
* * */