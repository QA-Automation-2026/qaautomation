package org.java.loops;

public class switchDemo {

    /*
    * switch(input)
    * {
    *   case 1 : sout;
    *   break;
    *   case 2 : sout;
    *   break;
    *   case 3 : sout :
    *   break;
    *   default :
    * }
    *
    * */
    public static void main(String[] args) {
        switchDemo obj = new switchDemo();}


    public switchDemo()
    {
        int age = 12;

        switch(age)
        {
            case 11 :
                System.out.println("first case");
                System.out.println("first case");
                System.out.println("first case");
                System.out.println("first case");
                break;
            case 12 :
                System.out.println("Second case");
                System.out.println("Second case");
                System.out.println("Second case");
                break;
            case 18 :
                System.out.println("Third case");
                System.out.println("Third case");
                System.out.println("Third case");
                break;
            default:
                System.out.println("default statement");
        }
    }
}
