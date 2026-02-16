package com.git.Package;

public class testAbstractImple extends testAbstract{


    public static void main(String[] args) {
        testAbstractImple ta = new testAbstractImple();
        int b=ta.testing();
        System.out.println(b);
        ta.testingCon();
        testingCon1();
    }
    @Override
    int testing() {
        return 10;
    }


}
