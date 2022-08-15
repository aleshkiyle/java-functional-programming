package funcByMetanit.streamAPI.mixingOperations;

import funcByMetanit.streamAPI.mixingOperations.util.Phone;

import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;

public class MixingOperationsRunner {

    private static final Integer NUMBERS_LETTERS_WORD = 3;

    public static void main(String[] args) {
        MixingOperationsLogic logic = new MixingOperationsLogic();
        MixingOperationsInitializer initializer = new MixingOperationsInitializer();

        List<String> names = initializer.getNames();
        List<Integer> numbers = initializer.getNumbers();
        List<Phone> phones = initializer.getPhones();

        // count()
        Predicate<String> predicateForCount = name -> name.length() > NUMBERS_LETTERS_WORD;
        System.out.println("Implement method count() Stream API:");
        System.out.println("Number of elements in the data stream: " + logic.implementMethodCountStreamAPI(names));
        System.out.println("Number of elements in the data stream where the length of the names is greater " +
                NUMBERS_LETTERS_WORD + ": " + logic.implementMethodCountStreamAPI(names, predicateForCount));
        System.out.println("------------------------------------");

        // findFirst(), findAny()
        System.out.println("Implement method findFirst() and findAny() Stream API:");
        logic.implementMethodFindFirstStreamAPI(names).ifPresent(System.out::println);
        logic.implementMethodFindAnyStreamAPI(names).ifPresent(System.out::println);

        // allMatch, anyMatch, noneMatch
        System.out.println("-------------------------------");
        System.out.println("Implement methods allMatch(), anyMatch(), noneMatch(): ");
        Predicate<String> predicateForAllMatch = name -> name.length() > NUMBERS_LETTERS_WORD;
        Predicate<String> predicateForAnyMatch = name -> name.length() == NUMBERS_LETTERS_WORD;
        Predicate<String> predicateForNoneMatch = name -> name.equals("Nasty");
        System.out.println("All names length more than 3: "
                + logic.implementMethodAllMatch(names, predicateForAllMatch)); // false
        System.out.println(logic.implementMethodAnyMatch(names, predicateForAnyMatch)); // true
        System.out.println(logic.implementMethodNoneMatch(names, predicateForNoneMatch)); // true
        System.out.println("-------------------------------");

        // min(Comparator comparator),  max(Comparator comparator)
        System.out.println("Implement methods min(comparator) amd max(comparator) Stream API:");
        Optional<Integer> minimumNumber = logic.implementMethodMinStreamAPI(numbers);
        Optional<Integer> maximumNumber = logic.implementMethodMaxStreamAPI(numbers);
        System.out.println("Minimum numbers in list: " + minimumNumber.get());
        System.out.println("Maximum number in list: " + maximumNumber.get());
        Optional<Phone> minPricePhone = logic.implementMethodMinByLowCostPhone(phones);
        Optional<Phone> maxPricePhone = logic.implementMethodMaxByTopCostPhone(phones);
        System.out.println("Low cost phone: ");
        minPricePhone.ifPresent(System.out::println);
        System.out.println("Top cost phone: ");
        maxPricePhone.ifPresent(System.out::println);
    }
}
