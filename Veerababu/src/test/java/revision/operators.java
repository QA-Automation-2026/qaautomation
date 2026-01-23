package revision;

public class operators {

    /*
    * Operators
    * Arthimetic Operators = +,-,*,/(quotient),%(remainder)
    * Relational operators  ==, >=, <=, >, <, != (compariosion operators)
    * Logical Operators = &&, ||,!
    * Assignment operators = +=, -=, *=,/=
    * Unary Operators =++, --, +,-,!
    * Terinary operators -condition ? true: false
    * */

    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int c = a+b;
        // Arthimetic Operators
        System.out.println("Arthimetic Operations "+ (c+ (a+b)));

        // Relational Operators
        System.out.println(!(a<b));

        // logical operatos
        /*
        *   x       y           &&           ||      !x          !y
        * true       false       false      true     false     true
        * false     true        false       true     true        false
        * true     true        true        true    false       false
        * false     false       false       false    true        true
        * */

        int x = 10;
        int y =15;
        int z = 20;

        System.out.println((!(x<=y) || (y>=z)));

        System.out.println((x>=y));



    }
}
