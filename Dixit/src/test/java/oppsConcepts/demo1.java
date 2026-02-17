package oppsConcepts;

public class demo1 extends oppsDemo{

    public static void main(String[] arg){
        oppsDemo obj = new oppsDemo();
        int marks =function1(52,65);
        System.out.println(marks);
    }

    public static int differentParametersFunction(int a, int b){
        if(a>b) {
            return a;
        }else {
            return b;
        }
    }
    public static String differentParametersFunction(String name ){
        return "";
    }
}
