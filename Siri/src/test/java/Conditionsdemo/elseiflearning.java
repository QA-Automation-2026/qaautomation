package Conditionsdemo;

public class elseiflearning {
     int weather = 1;//1=rainy,,2=sunny,3=cloudy
    int sunny =2;
    int cloudy =3;
    public static void main(String[] args) {//global
        elseiflearning home = new elseiflearning();
        if (home.weather<home.sunny) {
            System.out.println("its rainy day so need an umbrella");
        }
        else if(home.sunny>home.cloudy) {
            System.out.println("its sunny need glasses");
        }
        else if(home.cloudy>home.sunny){
            System.out.println("no sunny");
        }
        else
            System.out.println("i like cloudy weather");


        }




    }




/*
* {
        ifelsePractice home=new ifelsePractice();
        if (home.gold1kg<home.copper){
            System.out.println("copper is less than gold");
        }else if(home.copper>home.gold1kg){
            System.out.println("copper is not costly");
        }else if(home.silverikg<home.gold1kg){
            System.out.println("silver is costly but not equal to gold");
        }else
            System.out.println("gold price is too high");


*
*
*
* */