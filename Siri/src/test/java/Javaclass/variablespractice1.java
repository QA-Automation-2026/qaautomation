package Javaclass;

public class variablespractice1 {

   static int a =10;
   static int b=20;
   static int c=30;

    public static void main(String[] args) {
        variablespractice1 obj=new variablespractice1();//global
        System.out.println(obj.a+b);//global and static
        System.out.println(obj.b-a);
        System.out.println(obj.a%b);
        System.out.println(obj.a/b);
        System.out.println(obj.a+c);

        System.out.println(a+b);
        System.out.println(a);

        int a= 40;//local
        int b=50;
        System.out.println(a<b);
        System.out.println(b>a);
        System.out.println(50);
        System.out.println(b);
        System.out.println(a+a+b);//static and local


    }


}
