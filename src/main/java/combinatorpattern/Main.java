package combinatorpattern;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Customer customer = new Customer("Fernando", "fer@gmail.com", "+0158748464", LocalDate.of(1999, 6, 2));

        System.out.println(new CustomerValidatorService().isValid(customer));

    }
}
