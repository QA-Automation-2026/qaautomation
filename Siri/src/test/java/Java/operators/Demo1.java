package Java.operators;

public class Demo1 {
   static  int a =20;
   static  int b=30;
    int c =20;


//  Arthimetic operators  -+,+*, (Reminder value ,Quotinet value)
public static void main(String[] args) {
 int a =20;
 int b=30;
    Demo1 home=new Demo1(); //Global
    System.out.println(home.a+b);
    System.out.println(home.a-b);
    System.out.println(home.a*b);
    System.out.println(home.a/b);
    System.out.println(home.a%b);




    System.out.println(Demo1.a+b);//static
    System.out.println(Demo1.a-b);
    System.out.println(Demo1.a*b);
    System.out.println(Demo1.a/b);
    System.out.println(Demo1.a%b);


    // local variable with in the class

    System.out.println ("Addition of two numbers "+(a+b));
    System.out.println ("substraction of two numbers "+(a-b)); //substraction
    System.out.println("mulitiplication  of two numbers "+(a*b));
    System.out.println("Division of two numbers "+(a/b));//Division of two numbers
    System.out.println("Modules of two numbers "+(a%b));

//static and global




}


}
