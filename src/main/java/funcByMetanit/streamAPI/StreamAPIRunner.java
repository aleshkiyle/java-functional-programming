package funcByMetanit.streamAPI;

import java.util.List;
import java.util.function.Predicate;

public class StreamAPIRunner {

    public static void main(String[] args) {
        List<String> cities = List.of("Paris", "London", "Madrid");
        Predicate<String> cityPredicate = city -> city.length() == 6;
        cities.stream() // получение потока
                .filter(cityPredicate) // применяем фильтрацию по длине строки, передевая на вход предикат
                .forEach(System.out::println); // выводим отфильтрованные данные на консоль

        StreamAPILogic streamAPILogic = new StreamAPILogic();
        streamAPILogic.createAndPrintIntStream();
        streamAPILogic.createAndPrintDoubleStream();
        streamAPILogic.implementMethodForEach();
    }


}
