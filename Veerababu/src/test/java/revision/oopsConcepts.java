package revision;

public class oopsConcepts {

    /*
     * Polymorpisam -*
     * Inheritance- *
     * Abstraction - *
     * Interface - *
     * Encapsulation
     *
     * */

    /*
     * Poly - many
     * morphisam - ways - many ways
     *  - Run time polymorphisam
     *  - compile time polymorphisam
     * Methods - Overloading and overriding
     *
     * */


    // accessmodifier statickeyword(Optional) returntype functionName(parameters){} - method signature

    /*
    * Access Modifiers
    * Public
    * Private
    * Protected
    * Default
    * */

    /*
    * Return types
    * void - (nothing returns) -
    * all primitive and non primitive data types - String ,arrays,
    * List
    * Map
    * Datarows
    * */

    public static void main(String[] args) {


        char s111 =  nonstaticMethodDemo1();
        System.out.println(s111);
    }

    // Non parameterised static method
    public static void sampleFunctionName(){

    }
    //  parameterised static method
    public static void sampleFunctionName1(int a){

    }
    //  parameterised static method
    public static void sampleFunctionName2(int x, int y){

    }

    //  parameterised static method
    public static void sampleFunctionName2(String x, int y){

    }

    //Non parameterised non static method
    public void nonstaticMethodDemo(){
        System.out.println("Setting project name");
    }

    // parameterised non static method
    public void nonstaticMethodDemo1(int a){
        System.out.println("here some code avaialble");
    }

    public static char nonstaticMethodDemo1(){

        return 'c';
    }

    /*
    * Method overloading means - Same function name + same return type and same access modifier
    *  but different parameters
    * */
}
