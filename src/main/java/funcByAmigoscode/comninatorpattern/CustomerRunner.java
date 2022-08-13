package funcByAmigoscode.comninatorpattern;

import java.time.LocalDate;

import static java.time.Month.*;

import static funcByAmigoscode.comninatorpattern.CustomerRegistrationValidator.*;

public class CustomerRunner {

    private static final Integer DAY_OF_BIRTHDAY = 29;

    public static void main(String[] args) {
        Customer customer = new Customer(
                "Alexey",
                "alexey.rodin62@gmail.com",
                "+89585116132",
                LocalDate.of(2002, MARCH, DAY_OF_BIRTHDAY)
        );

        // System.out.println(new CustomerValidatorService().isValidCustomer(customer));

        // if valid we can store customer in DB

        // Using combinator patter
        ValidationResult validationResult = isEmailValid()
                .and(isPhoneNumberValid())
                .and(isAdult())
                .apply(customer);

        System.out.println(validationResult);

        if (validationResult != ValidationResult.SUCCESS) {
            throw new IllegalStateException(validationResult.name());
        }

    }
}
