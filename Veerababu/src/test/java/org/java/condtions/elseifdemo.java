package org.java.condtions;

public class elseifdemo {

    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int c = 30;

        if (a < b)  // pappu Tomoto
        {
            System.out.println("a is less than b");
        } else if (b > c) // veg biryani
        {
            System.out.println("b is greater than c");
        }else if ((a+b)>c) // fried rice
        {
            System.out.println("Sum of a +b is greater than c");
        }else
        {
            System.out.println("order food on Zomoto");
        }
    }
}
