package revision;

public class variablesAndDataTypes
{
    /*
    * ctrl+shift+/ - to comment multiple lines of code
    * variables -
    * global variables - variables which are declared inside a class outside function
    * or method, global variables are also called as instance variables
    * non static variables, class level variables,
    * global variables cab be access by creating an object
    * object creation = className objectName = new className();
    *
    * static variables - variables which are declared inside a class but with having
    * static keyword,
    *  static variables can be access directly or by using class Name
    *
     * local variables - variables which are declared inside a method or function
     * the scope of local variable is with in the function or method only
     * variables can be anything, glass, box, bottle
     *
    *
    * */
    /*
    * Two types of data types, Primitive data types, Non primitive data types
    * Primitive Data types
    * int - to store the numbers(10,20,30,40) - -2^31 to 2^31-1
    * byte - to store the numbers - -128 to 127
    * float - to store decimal values(10.5f,20.5f) - upto 6 to 7 decimal values(4 bytes)
    * short - to store numbers - -32768 to 32767
    * long - to store numbers
    * double - to store decimal values(10.5,20.5) - upto 15 to 16 deciamls
    * boolean - to retun true or false
    * char - to store single characters - o to 65,535- ascii codes
    *
    * Non Primitive Data types
    * Strings
    * Arrays
    *
    *
    * */

    // global variables
    int a = 10;
    double c = 10.5;
    float f = 10.6f;

    // static varialbles
    static int a1 = 15;
    static int a2 = 25;
    static boolean b1 = true;


    public static void main(String[] args) {
        variablesAndDataTypes obj = new variablesAndDataTypes();
        System.out.println("Global variable value is "+obj.a);
        System.out.println("Static variable value is "+variablesAndDataTypes.a1);
        int a2 =10;
        System.out.println("Local variable value is "+a2);
    }

}
