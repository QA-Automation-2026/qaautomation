package Conditionsdemo;

import java.sql.SQLOutput;

public class calculaterclass {

    static int a = 20;
    static int b = 30;
    static int c = 40;
    static int d = 50;


    public static void main (String[] args) {
        if ((a + b) <= c) {
            System.out.println("a and b less than c");
        } else if ((c <= d)) {

            System.out.println("c is correct");
        }
        if(d>=c) {
            System.out.println("d is grater than c");
        }


    }
}