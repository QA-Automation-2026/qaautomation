package singleInheritance;

public class class2 extends class1 {

    public static void function1(){
        System.out.println("This is from class2 in function1");
    }
    public static void function2(){
        System.out.println("This is from class2 in function2");
    }

    public static void main(String[] args) {
        method1();
        method2();
        function1();
        function2();
    }
}
