package funcByMetanit.streamAPI.substreamAndMergingStreams;

import java.util.List;
import java.util.stream.Stream;

public class SubStreamAndMergingStreamsRunner {

    public static void main(String[] args) {
        SubStreamAndMergingStreamsLogic subStreamAndMergingStreamsLogic = new SubStreamAndMergingStreamsLogic();
        List<Integer> numbers = List.of(-3, -2, -1, 0, 1, 2, 3, -4, 5);
        List<String> names = List.of("Tom", "Bob", "Sam", "Tom", "Alice", "Kate", "Sam");
        Stream<String> stream1 = Stream.of("Alexey", "Nasty");
        Stream<String> stream2 = Stream.of("Marina", "Ivan", "Andrew");
        System.out.println("Implement method take while:");
        subStreamAndMergingStreamsLogic.implementMethodTakeWhile(numbers);
        System.out.println("----------------------------");

        System.out.println("Implement method drop while:");
        subStreamAndMergingStreamsLogic.implementMethodDropWhile(numbers);
        System.out.println("----------------------------");

        System.out.println("Implement method concat Stream:");
        subStreamAndMergingStreamsLogic.implementMethodConcatStreams(stream1, stream2).forEach(System.out::println);
        System.out.println("-------------------------");

        System.out.println("Implement method distinct Stream:");
        subStreamAndMergingStreamsLogic.implementMethodDistinct(names);
    }
}
