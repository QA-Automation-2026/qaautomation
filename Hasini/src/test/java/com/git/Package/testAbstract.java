package com.git.Package;

abstract class testAbstract {

    abstract int testing(); //abstract method
    public void testingCon()
    {
        System.out.println("concrete non static");
    }
    public static void testingCon1()
    {
        System.out.println("concrete  static");
    }

}