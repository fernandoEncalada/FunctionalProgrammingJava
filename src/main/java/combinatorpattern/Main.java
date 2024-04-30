package combinatorpattern;

import java.time.LocalDate;

import static combinatorpattern.CustomerRegistrationValidator.*;

public class Main {
    public static void main(String[] args) {
        Customer customer = new Customer("Fernando", "fergmail.com", "+0158748464", LocalDate.of(1999, 6, 2));

        System.out.println(new CustomerValidatorService().isValid(customer));

        // if is valid we can save the customer in the DB

        // Using combinator pattern
        ValidationResult result =
                isEmailValid()
                .and(isPhoneNumberValid())
                .and(isAnAdult())
                .apply(customer);

        System.out.println(result);

        if (result != ValidationResult.SUCCESS) {
            throw new IllegalStateException(result.name());
        }

    }
}
