package org.java.constructors;

import org.testng.annotations.Test;

public class constructorsDemo {

    /*
    * implict constructors -
    * explicit constructors - parametrerised and non parameterised
    * constrcutors scope is within the class onlyyy
    *
    * constructors name always same as classname
    * we can create multiple constroctors
    * there should be one default constructor
    * it can be created within the class only not in main method
    *
    *
    * multiple constructos
    * addition
    * */
    int a = 10;
    int b = 20;

    public static void main(String[] args) {
        int a = 19;
        constructorsDemo dem1 = new constructorsDemo();
        constructorsDemo demo = new constructorsDemo(dem1.a,dem1.b);
        constructorsDemo stringdemo = new constructorsDemo("Input",6);
        constructorsDemo addition = new constructorsDemo(a,6,8);
        constructorsDemo params = new constructorsDemo(5,"string");

//        className objectname = newkeyword constructor();
    }
//    accessmodifier classsname(){}

    //default constructor
    public constructorsDemo()
    {
        System.out.println("Inside non paramerised default constrcutor :");
    }
    public constructorsDemo(int a, int b)
    {
      System.out.println("Inside paramerised default constrcutor :"+a);
    }
    public constructorsDemo(String a, int b)
    {
        System.out.println("Inside paramerised String+" +b +"+ constrcutor :"+a);
    }
    public constructorsDemo(int b,String a)
    {
        System.out.println("Inside paramerised String constructor");
    }
    public constructorsDemo(int a, int b,int c)
    {
        System.out.println("Inside paramerised third constrcutor :"+(a+b+c));
    }
    public constructorsDemo(int a, int b,int c,int d)
    {
        System.out.println("Inside paramerised third constrcutor :"+(a-b-c-d));
    }
    @Test
    public void hello()
    {

    }



}
