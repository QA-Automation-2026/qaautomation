package com.git.Package;

public class testFunction {
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
    public static int greatestNumbers (int c, int d)
    {
        if (c > d)
        {
            return c;
        }else
        {
            return d;
        }
    }
    public static int squareNumbers (int c)
    {
        return (c * c);
    }
    public static int cubeNumbers (int c)
    {
        return (c * c * c);
    }
    public static double avgNumbers (int c, int d, int e)
    {
        return ((double)(c+d+e)/3);
    }

    public static int reminderNumber (int c, int d)
    {
        return (c % d);
    }
    public static void main (String [] args)
    {
        testFunction tf1 = new testFunction();
        int sum = tf1.additionOfTwoNumbers();
        System.out.println("addition of two numbers " + sum);
        int sub = subtracrionOfTwoNumbers();
        System.out.println("subtraction of two numbers " + sub);
        int a = 21;         int b = 30;
        int great = greatestNumbers(a,b);
        System.out.println("greatest number is " + great);
        int great1 = greatestNumbers(40,30);
        System.out.println("greatest number is " + great1);
        int c = 5;
        int square = squareNumbers(c);
        System.out.println("square of number is " + square);
        int cube = cubeNumbers(c);
        System.out.println("cube of number is " + cube);
        double avg = avgNumbers(a,b,c);
        System.out.println("average of numbers is " + avg);
        int reminde = reminderNumber(a,c);
        System.out.println("cube of number is " + reminde);
    }
}
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