package revision;

public interface interfaceDemo {

    // variables (constants)
    // abstract methods
    // default methods
    // static methods
    // private methods (Java 9+)

    public abstract  void demo();

    default void start() {
        System.out.println("Vehicle starting...");
    }

    static int add(int a, int b) {
        return a + b;
    }
    private void log(String msg) {
        System.out.println(msg);
    }

    default void info() {
        System.out.println("log info");
    }
}
