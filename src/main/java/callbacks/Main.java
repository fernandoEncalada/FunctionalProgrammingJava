package callbacks;

import java.util.function.Consumer;

public class Main {
    public static void main(String[] args) {

        hello("José", null, value -> {
            System.out.println("No last Name provided for: " + value);
        });

        helloRunnable("María", null, () -> System.out.println("Run!"));
    }

    static void hello(String firstName, String lastName, Consumer<String> callback) {
        System.out.println(firstName);
        if (lastName != null) {
            System.out.println(lastName);
        } else {
            callback.accept(firstName);
        }
    }

    static void helloRunnable(String firstName, String lastName, Runnable callback) {
        System.out.println(firstName);
        if (lastName != null) {
            System.out.println(lastName);
        } else {
            callback.run();
        }
    }
}
