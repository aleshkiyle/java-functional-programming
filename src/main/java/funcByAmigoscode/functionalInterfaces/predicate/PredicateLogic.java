package funcByAmigoscode.functionalInterfaces.predicate;

import java.util.function.Predicate;

public class PredicateLogic {

    public final Predicate<String> isPhoneNumberValidPredicate =
            phoneNumber -> phoneNumber.startsWith("07") && phoneNumber.length() == 11;


    public final Predicate<String> containsNumberThree =
            phoneNumber ->
                    phoneNumber.contains("3");


    public boolean isPhoneNumberValid(String phoneNumber) {
        return phoneNumber.startsWith("07") && phoneNumber.length() == 11;
    }

}
