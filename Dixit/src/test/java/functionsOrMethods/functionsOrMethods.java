package functionsOrMethods;

public class functionsOrMethods {
    public static void main(String[] arg){
        functionsOrMethods obj = new functionsOrMethods();
        multiplicationTable(6);
    }
    public void printEvenNumbers(){
        for(int i = 1; i<=50; i++){
            if(i % 2 == 0){
                System.out.println(i);
            }
        }
    }
    public static void multiplicationTable(int number){
        for(int i =1; i<=10; i++){
            System.out.println(number + "*" +i + "=" + (number * i));
        }
    }
}
