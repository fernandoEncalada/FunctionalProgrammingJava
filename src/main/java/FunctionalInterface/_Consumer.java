package FunctionalInterface;

import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class _Consumer {
    public static void main(String[] args) {
        Customer jose = new Customer("José", "099805836");
        // Normal java function
        greetCustomer(jose);

        // Consumer Functional Interface
        greetCustomerConsumer.accept(jose);

        greetCustomerConsumerV2.accept(jose, false);
    }

    static BiConsumer<Customer, Boolean> greetCustomerConsumerV2 = (customer, showPhone) ->
            System.out.println("Hello " + customer.name + " your phone number is: " + (showPhone ? customer.phone : "********"));
    static Consumer<Customer> greetCustomerConsumer =
            customer -> System.out.println("Hello " + customer.name + " your phone number is: " + customer.phone);

    static void greetCustomer(Customer customer) {
        System.out.println("Hello " + customer.name + " your phone number is: " + customer.phone);
    }

    static class Customer {
        private final String name;
        private final String phone;

        public Customer(String name, String phone) {
            this.name = name;
            this.phone = phone;
        }
    }
}
