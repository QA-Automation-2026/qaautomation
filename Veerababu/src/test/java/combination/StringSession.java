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






    }


}
