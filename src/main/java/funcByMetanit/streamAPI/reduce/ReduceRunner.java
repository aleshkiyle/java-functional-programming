package funcByMetanit.streamAPI.reduce;

import funcByMetanit.streamAPI.reduce.data.Phone;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.logging.Logger;

public class ReduceRunner {

    private static final Logger LOGGER = Logger.getLogger(ReduceRunner.class.getName());
    public static void main(String[] args) {
        ReduceLogic reduceLogic = new ReduceLogic();

        /* метод reduce имеет следующие формы:
        Выполняет терминальные операции сведения, возвращая некоторое значение - результат операции
        - Optional<T> reduce(BinaryOperator<T> accumulator)
        - T reduce(T identity, BinaryOperator<T> accumulator)
        - U reduce(T identity, BiFunction<U, ? super T, U> accumulator, BinaryOperator<U> combiner)
        */
        List<Integer> numbers = List.of(1, 2, 3, 4, 5);
        Optional<Integer> mulNumbers = reduceLogic.implementMethodReduceStreamAPI(numbers);
        LOGGER.info( "Product of numbers from a list: ");
        LOGGER.info("Mul numbers: " + mulNumbers.get());

        List<String> words = List.of("mama", "mila", "ramu");
        Optional<String> patter = reduceLogic.implementMethodReduceStreamAPIWithWords(words);
        LOGGER.info("Patter: ");
        patter.ifPresent(System.out::println);

        List<Phone> phones = List.of(
                new Phone("Iphone 6s", 54000),
                new Phone("Lumia 950", 45000),
                new Phone("Samsung Galaxy s 6", 40000),
                new Phone("LG G 4", 32000)
        );
        int sumPricePhones = reduceLogic.implementSumPricePhones(phones);
        System.out.println("Number of phones whose price is less than 50000: " + sumPricePhones);
        testReduceMethod();
    }

    private static void testReduceMethod() {
        List<Integer> numbers = Arrays.asList(1,2,3,4,5);
        int sum = numbers.stream()
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
}
