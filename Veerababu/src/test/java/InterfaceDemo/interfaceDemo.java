package InterfaceDemo;

public interface interfaceDemo {

    // Acccess keyword abstractkeyword  returntype      methodname
    void initialisebrowser(); // only declarations

    void frf();

    void userstory();

    // Interface - we can declare oly abstract methods
    // by default it has public abstract

    default void defaultmethod(){
        System.out.println("Implemented default method in interface");
    }

    static void staticmethods()
    {
        System.out.println("Implemented static method in methods");
    }


}
