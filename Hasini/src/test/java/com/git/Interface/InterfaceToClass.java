package com.git.Interface;

public class InterfaceToClass implements InterfaceTest1{


    @Override
    public int test1(int c, int d) {
        System.out.println("in test1 interface to class");
        int sum = c+d;
        return sum;
    }

    public static void main(String[] args) {
        InterfaceToClass IC = new InterfaceToClass();
        int d =IC.test1(20,30);
        System.out.println(d);
    }
}
