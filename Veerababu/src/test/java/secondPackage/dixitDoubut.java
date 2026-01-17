package secondPackage;

import methodsDemo.methodsSession;

public class dixitDoubut {

    /*
    * Two types of methods
    *
    * Predefined functions - main
    * User defined functions -
    *
    * Parameterised and Non Parameterised
    *
    *
    * */

    int a = 10;
    public static void main(String[] args) {




    }
    // Non Static Method, without return(void), Non Paraeterised
    public void firstDemo(){

    }
    // Static Method, without return(void), Non Paraeterised
    public static void secondDemo()
    {

    }

    // Static Method, without return(void), Paraeterised
    public static void thirdDemo(int a, int b)
    {
        int c = a+b;
        System.out.println("Addition of two numbers "+"a value is "+a+" and b value is "+b+" and total is "+c);
    }

    // Non Static Method, without return(void), Paraemterised
    public  void fourthDemo(String a, int b)
    {
        System.out.println("Eligibility age for vote for indian "+a +" is "+ b);
    }

}
