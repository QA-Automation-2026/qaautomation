package functions;

public class functions {
     public static void main(String[] args) {
        functions obj = new functions();
       functionFirstclass();
       obj.functionSecondclass();
    }
    public static void functionFirstclass(){
         System.out.println("This is First CLass");
    }
    public void functionSecondclass(){
        System.out.println("This is Second CLass");
    }
    public void functionThirdclass(){
        System.out.println("This is Third CLass");
    }

}
