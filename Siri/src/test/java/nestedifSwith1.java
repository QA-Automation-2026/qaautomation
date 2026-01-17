public class nestedifSwith1 {

    /*
     * syntax
     * Basic if condition
     * if(condition)
     * {
     *       code here
     * }else
     * {
     *       code here
     * }
     * */
    /*

     */

    static int a = 50;
    static int b = 80;
    static int vasu = 20;
    static int suri = 25;

    public static void main(String[] args) {
        if ((a >= b)) {
            System.out.println("a is greater or equal then b");
        } else {
            System.out.println("b is greter then a");
        }
        if ((vasu <= suri)) {
            System.out.println("vasu is greter then or equal to suri");
        } else {
            System.out.println("suri is greater then vasu");
        }
        int eligible = 18;//grater
        int noteligible = 16;//less than
        int age = 18;
        int sides = 5;



        if ((eligible == age)) {
            System.out.println("eligible is correct answer ");

        }
        int d = 30;
        int g = 40;
        if (!(d >= g)) {//! means not
            System.out.println("d value is false");

        } else {
            System.out.println("g value is correct answer");
        }
        if (sides == 3) {

            System.out.println("triangel");
        } else {
            System.out.println("not a triangel");

        }
    }
}
//please check code