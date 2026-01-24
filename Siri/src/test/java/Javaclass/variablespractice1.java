package Javaclass;

public class variablespractice1 {

   static int a =10;
   static int b=20;
   static int c=30;
       int d= 40;
       int e =60;

    public static void main(String[] args) {
        variablespractice1 obj=new variablespractice1();//global
        System.out.println(obj.a+b);//global and static
        System.out.println(obj.d);//global
        System.out.println(a%b);//static
        System.out.println(obj.d+obj.e);//global
        System.out.println(obj.a+c);

        System.out.println(a+b);
        System.out.println(a);

        int a= 40;//local
        int b=50;
        System.out.println(a<b);
        System.out.println(b>a);
        System.out.println(50);
        System.out.println(b);
        System.out.println( variablespractice1.a+a+b);//static and local


    }


}
