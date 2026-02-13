abstract class abstractionDemo {

    /*
    * It is the process of hiding implementation and showing only functionality to the end useer
    *  abstract data can be used by extending abstract class to normal class using extends
    *
    * Inheritance - extends
    * abstraction - abstract class to normal class using extends
    * */

    abstract String demoMethod();

    abstract  void demo2();

    abstract void demo3();

    public void normalMethod()
    {

    }
    public static void method1(){
        System.out.println("abstract static method");
    }

    /*
    * Abstract class should be defiend with abstract keyword
    * Abstract method should be defined with abstract keyword
    * Abstract method has no body, only declaration
    * Abstract methods should be defined within the abstract classes
    * Abstract method cannot be private , static
    * Abstract methods must be overriden in the child class or inhertied class
    * abstract methods must be inherited,
    * Object creation is not possible in abstract class
    * can create variables and final methods and static methods
    *
    * */


}
