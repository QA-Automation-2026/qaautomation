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

        // Unary Operators
        //Pre incremental and post incremental
//        ++l; - Pre incremental
//        l++;- Post incremental
        int l = 1;
        int j = 10;

        System.out.println("Pre Incremental operator "+ ++l);
        System.out.println("Pre incremental value is "+l);

        System.out.println("Post Incremental operator "+ j++);  // 10
        System.out.println("Post incremental value is "+j); // 11

//        --l = Pre decremental
//         l-- = post decremental

        System.out.println("pre decrement operator "+ --l);
        System.out.println("Post decremental operator"+ j--); //  11
        System.out.println("post decremental value is "+ j);

        boolean statement = true;
        System.out.println(!statement);


        // Assignment Operators

        int m = 10;
        m = m+5;
        m += 5;

        // Terinary operator
        //condition ? true : false
        int i = 10;
        j = 15;
        int c1 = (i<j)?i:j;
        System.out.println(c1);
        
    }
}
