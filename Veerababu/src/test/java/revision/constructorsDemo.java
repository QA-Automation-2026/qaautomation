package revision;

public class constructorsDemo {

    /*
    * Constrcutors are always starts with classname
    * default constructor
    * paameterised constrcutor
    * constructor overloading
    * this() constrcutor chaining
    * syntax- accessModifier constructorName(){}
    * accessmodifers - public, private, default, protected
    * constructor cannot be static
    * */

    public static void main(String[] args) {
        constructorsDemo demo = new constructorsDemo();
        constructorsDemo demo1 = new constructorsDemo(10);
        constructorsDemo demo2 = new constructorsDemo(20);
        constructorsDemo demo3 = new constructorsDemo(40);
        constructorsDemo demo4 = new constructorsDemo(60,80);
        constructorsDemo demo5 = new constructorsDemo(80,100);
        constructorsDemo demo6 = new constructorsDemo(50.5);
        constructorsDemo demo7 = new constructorsDemo(60.6);
        constructorsDemo demo8 = new constructorsDemo(80.5);
    }

    // Non parameterised constructor or default constrcotr
    public constructorsDemo()
    {
        System.out.println("constructor");
        // Operators
    }
    // Parameterised constructor
    public constructorsDemo(int i){
        System.out.println("Value of i is "+i);
        // switch cases
        switch(i){
            case 1 :
                System.out.println("value is 1");
                break;
            case 2 :
                System.out.println("value is 2");
                break;
            default:
                System.out.println("No value is matching");
        }
    }
    public constructorsDemo(int i,int j){
     //   System.out.println("Value of i is "+i+" and value of j is "+j+" and addition is "+(i+j));

    }
    public constructorsDemo(int i,double name){
       // System.out.println("Value of i is "+i+" and value of j is "+j+" and addition is "+(i+j));
    }
    public constructorsDemo(double age){
        System.out.println("Age is "+age);
    }

}
