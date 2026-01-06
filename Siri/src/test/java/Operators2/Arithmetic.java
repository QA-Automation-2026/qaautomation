package Operators2;

public class Arithmetic {

    static int a =10; //brothers and sisters
    byte b =20; //relatives
    int d=(a>=b) ?a:b;

    public static void main(String[] args) {
        int a =30;//kids
         byte b =40;
         int c=50;
        Arithmetic home= new Arithmetic();
        System.out.println(home.a+home.b);
        System.out.println(home.a-home.b);
        System.out.println(home.a *home.b);
        System.out.println(home.a/home.b);
        System.out.println(home.a%home.b);

        System.out.println(Arithmetic.a+b);
        System.out.println(Arithmetic.a-b);
        System.out.println(Arithmetic.a*b);
        System.out.println(Arithmetic.a/b);
        System.out.println(Arithmetic.a%b);

        System.out.println(a+b);
        System.out.println(a-b);
        System.out.println(a*b);
        System.out.println(a%b);
        System.out.println(a/b);

        System.out.println(Arithmetic.a);//static and local
        System.out.println(Arithmetic.a+b);//static and local addition
        System.out.println(Arithmetic.a-b);// static and substraction with local

        System.out.println(home.a+a);//global and local
        System.out.println(home.a+Arithmetic.a+a);//global and static and local

        System.out.println(a++);//single statement means + is increment.this is unary operators
        System.out.println(a);//increment

        System.out.println(--a);//pre decrement
        System.out.println(--a);
        //
        System.out.println(a=a+5);//assignment operators
        System.out.println(a=a-5);
        System.out.println(a=a*b);
        System.out.println(a=a);//Relational operators
        System.out.println(b!=b);
        System.out.println(a>b);
        System.out.println(a<b);
        System.out.println(a>=a);
        System.out.println(a<=b);
        System.out.println(a<=b);
        System.out.println("comparing a is greater then b or not :"+((a<b)&&(a<b)));
        System.out.println("comparing a is equal  a or not :"+((a==a)));
        System.out.println("verifying a is equal to b is " + (a!=b));

        System.out.println("verifying a is equal to b is " + (a<=b));
        System.out.println("verifying a is equal to b is " + (a>=b));
        System.out.println("verifying a is equal to b is " + (a==b));
        System.out.println("verifying a and  b  " + ((a>b)||(a<b)));//logical operators multible conditinons if true or false
        System.out.println("verifying a and  b " + (((a>c)&& (c<=b))&&(a<c)));
        System.out.println("verifying a and  b  " + ((a<c)||(a<=b)));

        System.out.println((a>=b) ? a:b);  //Terinary operators first condition next quiestion mark then result1 if true and result2 if false

//check values
    }
    }


