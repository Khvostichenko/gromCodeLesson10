package lesson10.polyexample;

public class User extends Human{

    public User(String name) {
        super(name);
    }

    @Override
    void run() {
        System.out.println("user class is called...");
        super.run();
    }
}
