package com.interfaceToabstractionToNormalClass;

public abstract class abstractClassDemo2 implements interfaceDemo1 {

    public void function1(){
        System.out.println("This is function1 from interface");
    }
    public int function2(int a, int b){
        if (a>b){
            return b;
        }else {
            return a;
        }
    }
}
