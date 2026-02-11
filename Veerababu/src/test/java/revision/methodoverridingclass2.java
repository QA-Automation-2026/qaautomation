package revision;

public class methodoverridingclass2 extends methodOverridingClass1{

    public static void firstMethod(){

        System.out.println("Today is tuesday");
    }

    public static void main(String[] args) {
        firstMethod();
        methodoverridingclass2 obj = new methodoverridingclass2();
        obj.secondMethod();
    }

}
