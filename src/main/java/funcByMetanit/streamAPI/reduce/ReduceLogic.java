package funcByMetanit.streamAPI.reduce;

import funcByMetanit.streamAPI.reduce.data.Phone;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.logging.Logger;

public class ReduceLogic {

    private static final Logger LOGGER = Logger.getLogger(ReduceRunner.class.getName());

    public Optional<Integer> implementMethodReduceStreamAPI(List<Integer> numbers) {
        return numbers.stream()
                .reduce((number1, number2) -> number1 * number2);
    }

    public Optional<String> implementMethodReduceStreamAPIWithWords(List<String> words) {
        return words.stream()
                .reduce((word1, word2) -> word1 + " " + word2);
    }

    public int implementSumPricePhones(List<Phone> phones) {
        return phones.stream()
                .reduce(0,
                        (x, y) -> {
                            if (y.price() < 50000)
                                return x + y.price();
                            else
                                return x;
                        },
                        Integer::sum);
    }

    public void testReduceMethodFromBaeldung() {
        List<Integer> numbers = Arrays.asList(1,2,3,4,5);
        Integer sum = numbers.stream()
                .reduce(0, Integer::sum);
        System.out.println(sum);
        double mul = numbers.stream()
                .reduce(1, (subtotal, element) -> subtotal * element).doubleValue();
        System.out.println(mul);
        List<Integer> ages = List.of(25, 30, 45, 28, 32);
        int computedAges = ages.parallelStream()
                .reduce(0, Integer::sum);
        System.out.println(computedAges);
    }

    public void checkNumberOptional(Optional<Integer> mulNumbers) {
        if (mulNumbers.isPresent()) {
            System.out.println("Mul numbers: " + mulNumbers.get());
        } else {
            LOGGER.info("numbers list is empty");
        }
    }
}
