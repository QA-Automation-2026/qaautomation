package combination;

public class StringSession {

    /*
    * Non Primitive Data Types - String
    * String = "Sequence of characters" with in the double quotations
    * "Names or paragraphs, single line statments"
    *
    * Strings are of two types
    * String, (String builder and string buffer)
    *
    * String are immutable - (not having chaging nature)
    *
    *
    *
    * */
    public static void main(String[] args) {
        String s = "Khazana"; // New Memory
        System.out.println(s.hashCode()); // hascode is used to get address id
         s = s+"Lalitha";
        System.out.println(s.hashCode());

        StringBuilder sb= new StringBuilder("Value1");
        System.out.println("String builder memory "+sb.hashCode());
        sb.append("Value2");
        System.out.println("String builder memory after appending "+sb.hashCode());

        // ==(memory address) and equals(values compare)

//        System.out.println(s==s1);
//        System.out.println(s.equals(s1));


        // String constant pool = it is a special memory allocated inside a heap area

        // new keyword is used to allocate memory at run time in the heap area

        String s2 = new String("Sireesha");
        System.out.println(s2.hashCode());
        String s3 = new String("Sireesha");
        System.out.println(s3.hashCode());
        System.out.println(s2==s3);
        System.out.println(s2.equals(s3));

        // String builder - Mutable


        String name = "Sireesha";  // String constant pool - 123456
        name = name + "Siri"; // 2569854
        name ="s"; // 98565558
        String n = "Sireesha";

        String obj = new String("Dixit"); // heap area = object = 2256588
                                                    // scp = 69874987777

        System.out.println("value at o index is "+ n.indexOf(1));

        // String builder and String buffer

        StringBuilder sbd = new StringBuilder("JoinvAvvanu");

        System.out.println("Before trimming "+ sbd+" and length is "+ sbd.length() + " capacity is "+ sbd.capacity());

        System.out.println("Length of a given string is  "+sbd.length());

        System.out.println("Appeding vaalue  "+ sbd.append(" Mawa"));

//        System.out.println("Deleting valu at 4th index  "+sbd.deleteCharAt(4));

        sbd.delete(0,4);
        System.out.println("After deleting value is "+sbd);

        System.out.println(sbd.insert(sbd.length(),'a'));

        int i = 10;
        int j =15;
        int[] a = {10,15,20,2,585};

        String s11 = "veg1#veg2#veg3#veg4";
        String[] ssssss = s11.split("#");










    }


}
