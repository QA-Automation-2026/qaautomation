package tweleveJan2026;

public class nestedifpractice {
    public static void main(String[] args) {
        boolean gmaildomain = true;
        boolean inboxavailable = true;
        boolean draftsavaialble = false;

        if (gmaildomain) {//if condition returns aalways true or false(based on first condition saticefy depending)
            System.out.println("gmaildomain is avaialble");
            {
                if (inboxavailable) {
                    System.out.println("inbox is available");
                    if (draftsavaialble) {
                        System.out.println("draft is available");
                    }else
                        System.out.println("draft is not avaialble");
                }



            }
        }else
            System.out.println("gmail domain is not avaialable");

        }
    }
















/*
* int age = 20;
boolean isCitizen = true;

if (age >= 18) {
  System.out.println("Old enough to vote.");

  if (isCitizen) {
    System.out.println("And you are a citizen, so you can vote!");
  } else {
    System.out.println("But you must be a citizen to vote.");
  }
} else {
  System.out.println("Not old enough to vote.");
}
*
* */