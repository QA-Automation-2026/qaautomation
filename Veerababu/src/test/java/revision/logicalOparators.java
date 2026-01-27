package revision;

public class logicalOparators {
    int age =20;
    int b=18;

    public static void main(String[] args) {
        char ch = 'A';
        logicalOparators obj=new logicalOparators();
        System.out.println(" age is eligible for the job"+(obj.age >= 18 && obj. age >=20));
        System.out.println("person below 18 not eligible for the job"+(obj.b<18));
        System.out.println( "a is vowel"+
         (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'));


    }
}

