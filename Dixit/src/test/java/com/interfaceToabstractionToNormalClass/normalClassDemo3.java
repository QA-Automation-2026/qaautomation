package com.interfaceToabstractionToNormalClass;

public class normalClassDemo3 extends abstractClassDemo2{

    public static void main(String[] arg){
        normalClassDemo3 obj1 = new normalClassDemo3();
        String anime = obj1.function3();
        System.out.println(anime);
        int i = obj1.function2(25, 35);
        System.out.println(i);
        obj1.function1();
    }
    public String function3() {

       String  anime1 = "Solo Leveling";

        System.out.println(anime1.hashCode());

       String anime2 = "Solo Leveling";

        System.out.println("the origin name is" + anime2.hashCode());

        return anime1;
    }
}
