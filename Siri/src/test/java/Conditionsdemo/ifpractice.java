package Conditionsdemo;

public class ifpractice {
    int a = 2;
    int b = 4;
    int c = 5;
    int d = 6;
    int age =20;
    int years =18;
   static int vegbiriyani= 100;
   static int chikenbiriyani =80;

    public static void main(String[] args) {
         int gradeA =50;
         int  gradeB =60;
        ifpractice home = new ifpractice();
        if (home.a > home.b) {
            System.out.println("a is not grater than b");
        } else

            System.out.println("b is grater than a");
        {
            if (home.c > home.d) {
                System.out.println("ci is not grater than b");

            } else
                System.out.println("d is greater than c");
            {
                if (home.age>home.years ){
                    System.out.println("his age is not 18");
                }else
                    System.out.println("his age is 20 old");

            }
            if(gradeA>gradeB){
                System.out.println("gradeA marks less then gradeB");
            }else
                System.out.println("gradeB marks grater than gradeA");

        }
           if (ifpractice.vegbiriyani<ifpractice.chikenbiriyani){
               System.out.println("chicken biriyani is not healthy");
           }else
               System.out.println("veg biriyani is tasty");
    }
}


