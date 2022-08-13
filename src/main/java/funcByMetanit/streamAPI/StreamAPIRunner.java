package funcByMetanit.streamAPI;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;

public class StreamAPIRunner {

    public static void main(String[] args) {
        List<String> cities = List.of("Paris", "London", "Madrid");
        Predicate<String> cityPredicate = city -> city.length() == 6;
        cities.stream() // получение потока
                .filter(cityPredicate) // применяем фильтрацию по длине строки, передевая на вход предикат
                .forEach(System.out::println); // выводим отфильтрованные данные на консоль
        createAndPrintIntStream();
        createAndPrintDoubleStream();
    }

    private static void createAndPrintIntStream() {
        IntStream integerStream = IntStream.of(-5, 2, 3, 4);
        integerStream.forEach(System.out::println);
    }

    private static void createAndPrintDoubleStream() {
        DoubleStream doubleStream = DoubleStream.of(3.3, -5.12, 12.33);
        doubleStream.forEach(System.out::println);
    }
}
