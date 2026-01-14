package com.git.Package;

public class methodDefinition {

    public static void add (int a, int b)
    {
        System.out.println("calling add method to add numbers");
        int c = a+b;
        System.out.println(c);
    }

    public void fortest (int a, int b)
    {
        System.out.println("calling fortest method to print sequence of numbers in asceneding or descending order");
        if (a <= b) {
            for (int i = a; i <= b; i++) {
                System.out.println(i);
            }
        } else {
            for (int i = a; i >= b; i--) {
                System.out.println(i);
            }
        }
    }

    public static void mul (int a, int b)
    {
        System.out.println("printing multiplication");
        for (int i=1; i<=b; i++)
        {
            System.out.println(a*i);
        }
    }
    public static void casemethod (int a)
    {
        System.out.println("switch method");
        switch (a)
        {
            case 10:
                System.out.println("ten");
                break;
            case 20:
                System.out.println("Twenty");
                break;
            default:
                System.out.println("default");
        }
    }
    public methodDefinition ()
    {
        System.out.println("this is constructor");
    }


}
