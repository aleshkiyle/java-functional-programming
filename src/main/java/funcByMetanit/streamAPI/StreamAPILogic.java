package funcByMetanit.streamAPI;

import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamAPILogic {

    public void createAndPrintIntStream() {
        IntStream integerStream = IntStream.of(-5, 2, 3, 4);
        integerStream.forEach(System.out::println);
    }

    public void createAndPrintDoubleStream() {
        DoubleStream doubleStream = DoubleStream.of(3.3, -5.12, 12.33);
        doubleStream.forEach(System.out::println);
    }

    public void implementMethodForEach() {
        Stream<String> citiesStream = Stream.of("Ryazan", "Berlin", "Moscow");
        citiesStream.forEach(System.out::println);
    }
}
