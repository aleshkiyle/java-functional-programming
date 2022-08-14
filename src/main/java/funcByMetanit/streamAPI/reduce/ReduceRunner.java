package funcByMetanit.streamAPI.reduce;

import java.util.Optional;
import java.util.stream.Stream;

public class ReduceRunner {

    public static void main(String[] args) {
        Stream<Integer> numbers = Stream.of(1, 2, 3, 4, 5);
        Optional<Integer> number = numbers.reduce((x, y) -> x * y);
        number.ifPresent(System.out::println);

        Stream<String> wordsStream = Stream.of("mama", "mila", "ramu");
        Optional<String> word = wordsStream.reduce((x, y) -> x + " " + y);
        word.ifPresent(System.out::println);
    }
}
