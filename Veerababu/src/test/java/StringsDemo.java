public class StringsDemo {

    public static void main(String[] args) {
        String s = "String Demo";
        String s1 = new String("String demo value"); //
        String s3 = new String("String demo value"); //
        String s2 = "String Demo";

        boolean memoryCheck = (s==s2); // == operator is used to check memory address// equals
        boolean memoryCheck1 = (s1==s3);
        System.out.println(memoryCheck1);
        System.out.println(s1.equals(s3));

        // Strings are immutable(can't be changed")
        String name = "Demo";
        System.out.println(name +" " + name.hashCode());
        name = name + "Demo";

        System.out.println(name +" " + name.hashCode());

        // String builder and String buffer - mutable
        StringBuffer b = new StringBuffer();

    }

    public int add(String x, int y){

        return 10;
    }
    public String add( String value){

        return "Veerababu";
    }
}
