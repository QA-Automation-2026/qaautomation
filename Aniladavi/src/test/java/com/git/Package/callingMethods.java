package com.git.Package;

public class callingMethods {
    static int a = 50;
    public static void main (String [] args)
    {
        methodDefinition md1 = new methodDefinition();
        methodDefinition.add(10, 20);
        System.out.println();
        md1.fortest(35, 20);
        methodDefinition.mul(2, 10);
        methodDefinition.casemethod (a);
    }

}
