package InterfaceDemo;

public class hasiniWorking implements interfaceDemoSession, SecondInterface, thirdInterface{

    /*
    *
    * Interface to class using implements keyword
    * */

    public static void main(String[] args) {
        hasiniWorking hw = new hasiniWorking();
        hw.login();
        hw.register();
    }


    @Override
    public void login() {
        System.out.println("This is from interface demo session");
    }

    @Override
    public void register() {
        System.out.println("This is from second interface");
    }

    @Override
    public void dashboard() {
        System.out.println();
    }

    @Override
    public void payment() {
        System.out.println();
    }

    @Override
    public void print() {
        System.out.println("This is from second interface");
    }

    @Override
    public void password() {

    }

    @Override
    public void addToCart() {

    }

    @Override
    public void price() {

    }

    @Override
    public void property() {

    }

    @Override
    public void example() {

    }

    @Override
    public void paper() {

    }

    @Override
    public void chalkpiece() {

    }
}
