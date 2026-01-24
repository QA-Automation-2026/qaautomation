package Javaclass;

public class variablespractice1 {

   static int a =10;
   static int b=20;
   static int c=30;

    public static void main(String[] args) {//global
        variablespractice1 obj=new variablespractice1();
        System.out.println("variablespractice1+a>=b");//global and static
        System.out.println("b>a");
        System.out.println("a<b");
        System.out.println("a+b>c");
        System.out.println("a+b=c");

        System.out.println("a and b");//static
        System.out.println("a");

        int a= 40;//local
        int b=50;
        System.out.println("a<b");
        System.out.println("b>a");
        System.out.println("50");
        System.out.println("a+a+b");//static and local


    }


}
