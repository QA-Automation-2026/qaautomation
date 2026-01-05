package com.loops.practie;

public class practice {

    int w = 10;


// Syntax = Datatype variablename = literal(value);
    /*
    * statickeyword Datatype variablename = literal(value);
    *
    * */

/*
* Combination of global variables + static variables
* Combination of global variables + local variables
* Combination of global variables + static variables + local variables
* Combination of local variables + static variables
* */

    public static void main(String[] args)
    {
        int w=20;
        practice home= new practice();
        System.out.println(w+home.w);

    }



    public static void method1()
    {
        int w=20;
        practice home= new practice();
        System.out.println(w+home.w);

    }






}
