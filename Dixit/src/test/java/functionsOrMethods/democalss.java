package functionsOrMethods;

public class democalss
{
    public static void main(String[] arg)
    {
        democalss k = new democalss();
        k.function2();
        int highestMarks = k.function1(25, 55);
        System.out.println(highestMarks);
    }

    public int function1(int student1, int student2){

        if(student1<student2){
            return student2;
        }else {
            return student1;
        }
    }

    public void function2(){
        System.out.println("Function2 is prinited");
    }
}
