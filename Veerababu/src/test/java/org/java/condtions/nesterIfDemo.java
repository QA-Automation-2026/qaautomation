package org.java.condtions;

public class nesterIfDemo {

    /*
    * First condition - Student has to get pass marks to move to next standard
    * */

    public static void main(String[] args) {
        int a = 100;
        int b = 20;
        int c= 15;

        if(a<b)
        {
            System.out.println("a is less than b is correct");
            if(b>=70)
            {
                System.out.println("Student can sit in first section");
                if(c>=60){
                    System.out.println("Student getting 60 percentage in first unit test");
                }else
                {
                    System.out.println("Student has to go to c section");
                }
            }
            else{
                System.out.println("Student got 35 percentage only, again has to study 6th standard ");
            }
        }else{
            System.out.println("Student failed in 6th standard, bye bye");
        }
    }
}
