package inheritance;

public class daughter2 extends father1 {
    int a =10;
    int b=20;
    public static void nonstaticmethodwithparametersnoreturn(int a, int b){
        System.out.println("addition of a+b in daughter2 class "+(a+b));
    }

}


/*
* public static void nonstaticmethodwithparametersnoreturn(String i, String j){

        System.out.println("Print the addition of i+j in demo2 class"+(i+j));
*
*
* */