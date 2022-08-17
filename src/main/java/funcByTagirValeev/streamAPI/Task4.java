package funcByTagirValeev.streamAPI;

import java.util.List;
import java.util.function.Supplier;
import java.util.stream.Stream;

import static java.util.Arrays.asList;

public class Task4 {

    // Сделать источник, генерирующий декартово произведение списков строк

    public static void main(String[] args) {
        List<List<String>> input = asList(asList("a", "b", "c"),
                asList("x", "y"), asList("1", "2", "3"));
        Supplier<Stream<String>> s = makeSourceGenerateCartesianProductOfListString(input);
        s.get().forEach(System.out::println);
    }

    private static Supplier<Stream<String>> makeSourceGenerateCartesianProductOfListString(List<List<String>> input) {
        return input.stream()
                // Stream<List<String>>
                .<Supplier<Stream<String>>>map(list -> list::stream)
                // Stream<Supplier<Stream<String>>>
                .reduce((sup1, sup2) -> () -> sup1.get()
                        .flatMap(e1 -> sup2.get().map(e2 -> e1 + e2)))
                // Optional<Supplier<Stream<String>>
                .orElse(() -> Stream.of(""));
    }


}
