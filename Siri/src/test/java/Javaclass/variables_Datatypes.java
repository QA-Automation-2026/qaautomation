package Javaclass;

public class variables_Datatypes
{



    /*
    *
    * global - class level variables, non static variables instance variables  global variables can be access by using object creation -
    * classname objectname = new classname();
    * local
    * static
    * */
    int a= 10;
    static int b = 20;


    public static void main(String[] args)
    {
        int a = 10;
        variables_Datatypes vd = new variables_Datatypes();
        System.out.println("value of  a is "+vd.a);
        System.out.println(b);
    }
}
