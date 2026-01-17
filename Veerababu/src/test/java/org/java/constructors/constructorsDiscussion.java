package org.java.constructors;

public class constructorsDiscussion {

    /*
    * className obj = new Constructor();
    * implicit constructor
    * explicit construcotr - parameterised and non parametrised
    * we can create multiple constructors but it cant be duplicated
    *
     * */

    /*
    * Non parameterised snytax
    * accessmodifier classname()
    * {
    * // consructor
    * }
    * */
    public static void main(String[] args)
    {
        constructorsDiscussion obj = new constructorsDiscussion();
        constructorsDiscussion siri = new constructorsDiscussion(2,5);
        constructorsDiscussion veerababu = new constructorsDiscussion(200,500);
        constructorsDiscussion swaroopa = new constructorsDiscussion(10,20);
//        constructorsDiscussion anil = new constructorsDiscussion(1,5);
//        constructorsDiscussion dixit = new constructorsDiscussion(15,25);
//        constructorsDiscussion siricalling = new constructorsDiscussion("Siri");
//        constructorsDiscussion veerababucalling = new constructorsDiscussion("Veerababu");
//        constructorsDiscussion anilcalling = new constructorsDiscussion("anil");
//        constructorsDiscussion dixitcalling = new constructorsDiscussion("dixt");
//        constructorsDiscussion swaroopacalling = new constructorsDiscussion("swaroopa");
        constructorsDiscussion difparam = new constructorsDiscussion('s',5);
        constructorsDiscussion veerababucalling = new constructorsDiscussion('v',5);
        constructorsDiscussion anilcalling = new constructorsDiscussion('a',5);
        constructorsDiscussion dixitcalling = new constructorsDiscussion('d',5);
        constructorsDiscussion swaropacalling = new constructorsDiscussion('n',5);
    }

    // default non parmeterused construcotr
    public constructorsDiscussion()
    {
        int a = 10; // local
        int b = 20; // local
        if(a>b){
            System.out.println("a is greater than b");
        }else{
            System.out.println("condition is invalid");
        }
        System.out.println("Default Non parameterised constuctor");
    }

    public constructorsDiscussion(int a, int b)
    {
       if(a<b)
       {
           System.out.println("a is less than b");
           if(a<=10)
           {
               System.out.println("a value is less than equal to 20");
           }else{
               System.out.println("a value is not less than equal to 20");
           }
       }else
       {
           System.out.println("else block executed");
       }
    }
    public constructorsDiscussion(char a, int b)
    {
       System.out.println(a+" is calling");
    }

}
