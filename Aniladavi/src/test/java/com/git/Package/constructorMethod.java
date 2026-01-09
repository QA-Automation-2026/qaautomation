package com.git.Package;

public class constructorMethod {

    public static void main(String[] args) {
        int a = 20;
        int b = 30;

        String s1 = "Anil";
        String s2 = "Sagar";
        String s3 = "Vidya";

<<<<<<< HEAD
       /* constructorMethod np = new constructorMethod ();*/
        constructorMethod add = new constructorMethod (a,b);
       /* constructorMethod strcon = new constructorMethod (s1,s2);
        constructorMethod strle = new constructorMethod (s1,a);
        constructorMethod strlen1 = new constructorMethod ("test1");
        constructorMethod strlen2 = new constructorMethod ("test2");
        constructorMethod strlen3 = new constructorMethod (s1,s2,s3);*/
=======
//        constructorMethod add = new constructorMethod (a,b);
        constructorMethod strcon = new constructorMethod (s1,s2);
       // constructorMethod strle = new constructorMethod (s1,a);

>>>>>>> main
    }

    public constructorMethod ()
    {
        System.out.println("No parameters");
    }
<<<<<<< HEAD
    public constructorMethod (int text1, int text2)
    {
        System.out.println("added " + (text1+text2));
        if (text1 <= text2) {
            for (int i = text1; i<= text2; i++) {
                System.out.println(("For loop" + i));
            }
        }
=======

    public constructorMethod (int one, int two)
    {
        this("gfhghg",2);
        System.out.println("Two integers added " + (one+two));
>>>>>>> main
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
    public constructorMethod (String one)
    {
        System.out.println("String is " + one);
    }

    public constructorMethod (String one, String two, String three)
    {
        System.out.println("concat " + (one + "+" +two + "+" + three));
    }
}
