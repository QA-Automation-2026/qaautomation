package org.java.condtions;

public class conditionalStatements {

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
    * */

    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int c = 50;
        if(!(((a>c)&& (c<=b))||(a<c)))
        {
            System.out.println("a is greater than b - Siri");
        }else{
            System.out.println("b is greater than a - Veerababu");
        }
        if(a/b==0)
        { // / means reminder value
            System.out.println("a is even number");
        }else{
            System.out.println("a is not an even number");
        }
        char ch = 'e';
        if(ch=='a'|| ch == 'e'|| ch == 'i'||ch == 'o'|| ch == 'u')
        {
            System.out.println("e is a vowel");
        }else
        {
            System.out.println("d is a consonant");
        }
    }
}
