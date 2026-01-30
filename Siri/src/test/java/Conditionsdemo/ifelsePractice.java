package Conditionsdemo;

public class ifelsePractice {

    int gold1kg =5000;
    int silverikg =4000;
    int copper= 2000;

    public static void main(String[] args) {
        ifelsePractice home=new ifelsePractice();
        if (home.gold1kg<home.copper){
            System.out.println("copper is less than gold");
        }else if(home.copper>home.gold1kg){
            System.out.println("copper is not costly");
        }else if(home.silverikg<home.gold1kg){
            System.out.println("silver is costly but not equal to gold");
        }else
            System.out.println("gold price is too high");



    }

}
