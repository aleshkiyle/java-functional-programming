package funcByMetanit.streamAPI.parallelStreams;

import java.util.List;
import java.util.function.Predicate;

public class ParallelStreamsLogic {

    public Integer implementMethodParallelStream(List<Integer> numbers) {
        return numbers.parallelStream()
                .reduce((x, y) -> x * y)
                .orElse(-1);
    }

    public void implementFilterInLengthNamesUsingStream(List<String> names) {
        Predicate<String> predicateName = name -> name.length() == 3;

        names.stream()
                .filter(predicateName)
                .forEach(System.out::println);
    }

    public void implementFilterInLengthNamesUsingParallelStream(List<String> names) {
        Predicate<String> predicateName = name -> name.length() == 3;

        names.parallelStream()
                .filter(predicateName)
                .forEach(System.out::println);
    }
}
