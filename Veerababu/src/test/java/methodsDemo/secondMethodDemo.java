package methodsDemo;

import static methodsDemo.methodsSession.staticMethod;

public class secondMethodDemo {

    public static void main(String[] args) {
        methodsSession obj = new methodsSession();
        obj.firstMethod();
        obj.secondMethod();
        obj.thirdMethod();
        obj.fourthMethod();
        staticMethod();
    }

}
