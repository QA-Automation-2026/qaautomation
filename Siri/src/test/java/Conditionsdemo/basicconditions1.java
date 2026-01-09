package Conditionsdemo;

public class basicconditions1 {
 /*
    * if (condition)
    * else condition
    * if else if()
    *
    * 	Check whether a number is even or odd.
	42.	Check whether a character is a vowel or consonant.
	43.	Find grades based on marks using if-else.
	45.	Determine eligibility to vote based on age.
	46.	Write a calculator program using if-else.
	47.	Check whether a triangle is valid.
	48.	Find profit or loss.
*/

    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int c = 30;
        int d = 4;
        int e = 4;
        int f = 6;
        int g = 1;
        int h = 3;

        if (d / 2 == 0) {
            System.out.println("d is even number");
        } else {
            System.out.println("d is not even number");
        }
        if (h % 2 == 1) {
            System.out.println("h is not even number");
        } else {
            System.out.println("h is odd number");
        }
        char j = 'a';

        if (j == 'a') {
            System.out.println("a is vowel");
        } else {
            System.out.println("m is consonant");


        }
        char ch = 'a';
        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {

            System.out.println("a is vowel");

        } else {
            System.out.println("m is consonent");

            int t = 70;
//            int g = 80;
            int r = 90;
            if (g >= t) {
                System.out.println("g is gretar then t");
            } else {
                System.out.println();
            }
        }
    }
}
