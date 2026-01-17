package Javaclass;

import Thirdclass.democlass;

public class Datatypes
{

    /*

   1. Global variable or instance variable which are declared in side the class,it can be accessed by objects
   2. static variable
   3.local variables
   jar is container also we call variable )
1. Global variables or instance variables - variables which are declared inside a class,
It can be accessed by using objects
Home= object and New is memory at run time.
Premitive dataypes (jar=variable=20 value)
     */
    int jar =20;
    byte ring= 35;
    short flag=10;
    long bowl= 100;
    float glass = 10.50f;
    double bag = 30.678678;
    char c ='a';//(char always in single quotes and it allows only single cher)
    boolean b = true;
    boolean b1 = false;

    public static void main(String[] args) {
        // public static void =main method and only one time add. that s is entry point for execution
        Datatypes home = new Datatypes();//new =key word
            System.out.println(home.jar);
     System.out.println(home.ring);
     System.out.println(home.flag);
     System.out.println(home.bowl);
     System.out.println(home.glass);
     System.out.println(home.bag);
     System.out.println(home.c);
     System.out.println(democlass.a);





    }








//

/*
Dta types: we have 2 data types, one is premitive and Non premitive data types
Premitive data types: we have 8 types
   1. int = uesd to store numbers . memory size 4 bytes +-2
    2.byte=used to store numbers 1 byte  128 to 127
    3.short= decimal val  2 bytes  -32668 to 32789
    4.long = used to store numbers  8 bytes- ph numbers digit numbers
    5.float=decimal numbers -20.50  4 bytes  decimal numbers -+3*10
    6.double= used to store decimal numbers 8 bytes 10.60
    7.boolean=true or false
   8. char=used to store characters a,b,c,d,e,f,g

 */

}


