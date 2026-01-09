public class nestedifelse3 {  // based on mutible conditions

    /*
     * First condition - passenger  has to buy  business class ticket $3000
     *
     * */
    public static void main() {
        int business = 3000;
        int economy = 2500;
        int sale = 1500;
        if (business > economy) {
            System.out.println("bussiness>economy is correct");

            if (economy > sale) {
                System.out.println("passenger can sit economy is correct answer");
            } if (economy <= sale) {
                System.out.println("passenger can buy ticket in sale ");
            } else if (sale > economy) {

                System.out.println("passenager cannot get economy tickets");
            } else {
             System.out.println("passenger cancelled tickets ");
            }
        }
    }
}
//check values