package functions;

public class fuctionsUsingLoops {
    static int student1 = 95;
    static int student2 = 75;
    static int student3 = 85;


    public static void main(String[] arg){
       fuctionsUsingLoops obj = new fuctionsUsingLoops();
       obj.studentMarks();
    }
    public void studentMarks(){
        if(student1>student3){
            for(int i =1; i <=2; i++){
                System.out.println(i);
            }
            int j = 1;
            while (j <=5){
                System.out.println("the addition of 1 number " + j+1);
                j++;
            }
            System.out.println(student1 + ">>" + student3);
        }else{
            System.out.println(student1 + "<<" + student3);
        }
    }
}
