package Operators2;

public class relationalOparators {
    static int a = 20;
    static int b = 30;
    static int c = 40;

    public static void main(String[] args) //comparioson of operators
    {
       int age =20;
       int d=4;
       int h=3;
            System.out.println("a is less than b");
        System.out.println("b is greater than a"+ (a<=b));
        System.out.println("both numbers are equal" +(a==b));
        System.out.println("a  is positive num"+(a>20));
        System.out.println("a is negitive number"+(a<20));
        System.out.println("0 is zero"+ (0==0));
        System.out.println("age 20 is eligiblity to vote"+(a>=20));
        System.out.println("age 18 is not eligiblity to vote" +(a<=18));
        System.out.println("a is largest number"+ (a<=b));
        System.out.println("b is largest number a"+ (b>a));
        System.out.println("a is largest number than b"+(a>b && a>c));//three numbers
        System.out.println("d is even number"+ (d/2==0));
        System.out.println("h is odd number"+(h%2==1));
    }

}
/*
 (d / 2 == 0) {
            System.out.println("d is even number");
        } else {
            System.out.println("d is not even number");
        }
        if (h % 2 == 1) {
            System.out.println("h is not even number");
        } else {
            System.out.println("h is odd number");
        }
* */









