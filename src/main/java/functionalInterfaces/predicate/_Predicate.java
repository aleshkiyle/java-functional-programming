package functionalInterfaces.predicate;

// Predicate<T> interface represents a predicate (boolean-valued function) of one argument.
public class _Predicate {

    private static final String VALID_PHONE_NUMBER = "07000000000";
    private static final String VALID_PHONE_NUMBER_CONTAINS_NUMBER_THREE = "07000003000";
    private static final String NOT_VALID_PHONE_NUMBER = "12314515";

    public static void main(String[] args) {

        PredicateLogic predicateLogic = new PredicateLogic();
        System.out.println("Phone number is valid - " + predicateLogic.isPhoneNumberValid(VALID_PHONE_NUMBER));
        System.out.println("Phone number is valid - " + predicateLogic.isPhoneNumberValid(NOT_VALID_PHONE_NUMBER));

        System.out.println("Predicate functional interface for valid phone number: ");
        System.out.println(predicateLogic.isPhoneNumberValidPredicate.test(VALID_PHONE_NUMBER));


        System.out.println(
                "Phone number valid and contains number 3 - "
                        + predicateLogic.isPhoneNumberValidPredicate
                        .and(predicateLogic.containsNumberThree).test(VALID_PHONE_NUMBER_CONTAINS_NUMBER_THREE)
        );

        System.out.println("Phone number valid and contains number 3 - "
                + predicateLogic.isPhoneNumberValidPredicate
                .and(predicateLogic.containsNumberThree).test(VALID_PHONE_NUMBER));

    }


}
