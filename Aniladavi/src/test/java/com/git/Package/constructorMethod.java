package com.git.Package;

public class constructorMethod {

    public static void main(String[] args) {
        int a = 20;
        int b = 30;

        String s1 = "Anil";
        String s2 = "Sagar";

//        constructorMethod add = new constructorMethod (a,b);
        constructorMethod strcon = new constructorMethod (s1,s2);
       // constructorMethod strle = new constructorMethod (s1,a);

    }

    public constructorMethod ()
    {
        System.out.println("No parameters");
    }

    public constructorMethod (int one, int two)
    {
        this("gfhghg",2);
        System.out.println("Two integers added " + (one+two));
    }
    public constructorMethod (String one, String two)
    {
        this(1,5);
        System.out.println("concat " + (one + "+" +two));
    }
    public constructorMethod (String one, int two)
    {
        this();
        System.out.println("constructor method " + (one + "+" +two));
    }
}
