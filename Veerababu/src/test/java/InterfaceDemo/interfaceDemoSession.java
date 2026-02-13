package InterfaceDemo;

public interface interfaceDemoSession {


    public abstract void login();

    void register();

    void dashboard();

    void payment();

    public static void scenarios(){

    }
    default void paymentMethod(){

    }
    /*
    * Interface is a blueprint of a class
    * interface have abstract method declarations only
    * Interface cannot have any constrcutors
    * Interface can be implemented by using implements keyword
    * Supports multiple inheritance
    *
    * */
}
