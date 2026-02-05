package org.java.condtions;

public class nestedIfStatements {

    public static void main(String[] args) {
        /*
        * Nested if statements
        * */
        boolean isRepoNameAvaialble = true;
        boolean isMainBranchAvailable = true;
        boolean isVeerababuBranchIsAVisible = false;
        /*
        * if(condition- always returns true or false){
        * //our code here only
        * }else{
        * // our code here
        * }
        * */
        if(isRepoNameAvaialble)
        {
            System.out.println("Automation repo branch is available");
            if(isMainBranchAvailable)
            {
                System.out.println("Main Branch is available");
                if(isVeerababuBranchIsAVisible)
                {
                    System.out.println("Veerababu branch is available");
                }
            }
            else{
                System.out.println("Main branch is not available");
            }
        }
        else{
            System.out.println("Repo Branch is not avaialble");
        }


    }
}
