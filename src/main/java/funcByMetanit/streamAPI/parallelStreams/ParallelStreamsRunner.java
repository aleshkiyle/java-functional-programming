package funcByMetanit.streamAPI.parallelStreams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;

public class ParallelStreamsRunner {

    private static final List<String> NAMES =
            Arrays.asList("Tom", "Bob", "Sam", "Kate", "Tim");

    public static void main(String[] args) {

        System.out.println("Using parallel stream in reduce operation:");
        ParallelStreamsLogic parallelStreamsLogic = new ParallelStreamsLogic();
        Function<List<Integer>, Integer> function = parallelStreamsLogic::implementMethodParallelStream;
        System.out.println(function.apply(List.of(1, -5, 3)));
        System.out.println("-----------------------------------------");

        System.out.println("Implement parallel stream in filter names:");
        System.out.println("Serial stream: ");
        Consumer<List<String>> consumerFilterNamesStream =
                parallelStreamsLogic::implementFilterInLengthNamesUsingStream;
        consumerFilterNamesStream.accept(NAMES);
        System.out.println("\nParallel stream: ");
        Consumer<List<String>> consumerFilterNamesParallelStream =
                parallelStreamsLogic::implementFilterInLengthNamesUsingParallelStream;
        consumerFilterNamesParallelStream.accept(NAMES);







    }
}
