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


}
