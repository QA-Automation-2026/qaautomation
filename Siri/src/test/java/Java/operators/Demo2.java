package Java.operators;

public class Demo2 {

    int a =50;
    int b =60;
    int c=70;
    int d =80;
    int e =90;
    static int f=100;
    static int g=200;

    public static void main(String[] args) {

        int  a =10;
        int b =20;
        int h =40;
        int f =30;
        Demo2 home=new Demo2();
        System.out.println(home.a+a+f);//relative is global and local is son and static
        System.out.println(Demo2.f+f);//for static we call class name and local
        System.out.println(a++);//single statement always add one increment
        System.out.println(a);
        System.out.println(--a);
        System.out.println(--a);




    }




}
