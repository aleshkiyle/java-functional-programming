package funcByAmigoscode.comninatorpattern;

import java.time.LocalDate;
import java.time.Period;
import java.util.function.Function;

public interface CustomerRegistrationValidator
        extends Function<Customer, ValidationResult> {

    Integer IS_ADULT_AGE = 18;
    String REGEX_PHONE_NUMBER = "(\\+*)\\d{11}";

    static CustomerRegistrationValidator isEmailValid() {
        return customer -> { System.out.println("running email validation");
            return customer.email().contains("@") ?
                    ValidationResult.SUCCESS :
                    ValidationResult.EMAIL_NOT_VALID;
        };
    }

    static CustomerRegistrationValidator isPhoneNumberValid() {
        return customer -> { System.out.println("running phone number validation");
            return customer.phoneNumber().matches(REGEX_PHONE_NUMBER)?
                    ValidationResult.SUCCESS :
                    ValidationResult.PHONE_NUMBER_NOT_VALID;
        };
    }

    static CustomerRegistrationValidator isAdult() {
        return customer -> { System.out.println("running is adult check");
            return Period.between(customer.dateBirth(), LocalDate.now()).getYears() > IS_ADULT_AGE ?
                    ValidationResult.SUCCESS :
                    ValidationResult.IS_NOT_AN_ADULT;
        };
    }

    default CustomerRegistrationValidator and(CustomerRegistrationValidator other) {
        return customer -> {
            ValidationResult result = this.apply(customer);
            return result.equals(ValidationResult.SUCCESS) ? other.apply(customer) : result;
        };
    }
}
