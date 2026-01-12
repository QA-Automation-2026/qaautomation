package methodsDemo;

public class methodsSession
{

    int a = 10;  // global variables or instance variables or non static variables
    static int b = 20;  // direct calling or using class by calling

    public static void main(String[] args)
    {
        methodsSession obj = new methodsSession();
        System.out.println(obj.a);
        System.out.println(methodsSession.b);
        obj.firstMethod();
        obj.secondMethod();
        obj.thirdMethod();
        obj.fourthMethod();
        methodsSession.staticMethod();
    }

    /*
    *
    * User defined methods - parameterised and non parameterised
    * with reutrn and without return
    * static methods and non static methods
    * */

    // Non parameterised - without return - non static method
    public void firstMethod()
    {
        System.out.println("First Method");

    }
    // Non parameterised - without return - static method
    public static void staticMethod()
    {
        System.out.println("Static Method");
    }
    public void secondMethod()
    {
        System.out.println("Second Method");
    }
    public void thirdMethod()
    {
        System.out.println("Third Method");
    }
    public void fourthMethod()
    {
        System.out.println("Fourth Method");
    }
}
