package loops1;

public class switchpractice2 {
    public static void main(String[] args) {


        {
            int eligible = 19;

            switch (eligible) {
                case 18:
                    System.out.println("18 is vaild");
                    break;
                case 19:
                    System.out.println("19also valid ");
                    break;
                case 16:
                    System.out.println("age 16 is not eligible");
                    break;
                case 15:
                    ;
                    System.out.println("14 is not also eligible");
                    break;
                default:
                    System.out.println("18 and above age is eligible of voters");
            }
        }
    }
}
