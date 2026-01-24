package com.git.Package;

public class testFunction {

    /*
    * user defined functions
    * int
    *
    * float // static, non static
    * double // static, non static
    * boolean // static, non static
    * void // static, non static
    *
    * byte
    * long
    * double
    * char
    * boolean
    * short
    *
    * String, Array Objects
    *
    * public int pricewithGST ()
    * {
    *   int a = 40
    *   return 10;
    *
    *
    * }
    * */

    public int additionOfTwoNumbers ()
    {
        int a = 10;
        int b = 20;
        return (a+b);
    }
    public static int subtracrionOfTwoNumbers ()
    {
        int a = 10;
        int b = 20;
        return (a-b);
    }
    public static void main (String [] args)
    {
        testFunction tf1 = new testFunction();
        int sum = tf1.additionOfTwoNumbers();
        System.out.println("addition of two numbers " + sum);
        int sub = subtracrionOfTwoNumbers();
        System.out.println("subtraction of two numbers " + sub);

    }
}
