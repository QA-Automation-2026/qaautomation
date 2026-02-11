package heirarcheialInheritance;

public class demo3 extends demo2{

    public demo3(){
        System.out.println("Constructor in demo3 class");
    }

    /*
    Inheritance
    * Single - one class to another class
    * Multiple - it cannot be achieved through inheritance, it can be achieved by using inteface
    * Multi Level - grand father - father - son - child - so ....
    * Heirarchial -father to son, father to daughter, father to wife
    * */

    /*
    * Polymorphisam - Many+forms -it is avaialble forms
    * Run time polymorphisam
    * Compile polymorphisam
    * Functions - Method Overloaing - same function name, same return type, different parameters
    *           - Method overriding - same function name, same return type, same parameters
    *
    * */

    public static void functionName(){

    }
    /*
    * Combination of methods
    * Non Static Method with No parameters and No return types
    * Static method with No parameters and No return types
    *
    * Non Static Method with No parameters and having return types
    * Static method with No parameters and having return types
    *
    * Non Static Method with  parameters and No return types
    * Static method with parameters and No return types
    *
    * Non Static Method with  parameters and having return types
    * Static method with  parameters and having return types
    * */

    // Accessmodifer statickeyword returntype methodname(with parameters or without parameters){} - method signature

    // Non Static Method with No parameters and No return types
    public void nonstatiMethodNoParameters()
    {
        System.out.println("Non Static Method with No parameters and No return types");
    }

    //Static method with No parameters and No return types
    public static void statiMethodNoParameters(){
        System.out.println("Static method with No parameters and No return types");
    }

    // Non Static Method with No parameters and having return types
    public String NonStaticNoParametersWithReturnTypes(){
        String v = "Learining automation";
        return v;
    }

    // Static method with No parameters and having return types
    public static int statiMethodNoParametersWithReturnTypes(){
        int i = 2026;
        return i;
    }

    //Non Static Method with  parameters and No return types
    public void nonstaticmethodwithparametersnoreturn(int i, int j){
        System.out.println("Print the addition of i+j "+(i+j));
    }
    public static void nonstaticmethodwithparametersnoreturn(String i, String j){
        demo2.nonstaticmethodwithparametersnoreturn(i,j);
        System.out.println("Print the addition of i+j in demo 3 cass "+(i+j));
    }


    //Static Method with  parameters and No return types
    public void staticmethodwithparametersnoreturn(String name, int j){
        System.out.println("age of the person "+name+" is "+j +"years");
    }

    //Non Static Method with  parameters and having return types
    public double nonstaticmethodwithparametersreturntypes(double l, double l2){
        return (l+l2);
    }

    //Static method with  parameters and having return types
    public static boolean staticmethodwithparameterswithreturntypes(){
        return true;
    }

}
