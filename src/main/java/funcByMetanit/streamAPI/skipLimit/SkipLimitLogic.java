package funcByMetanit.streamAPI.skipLimit;

import java.util.List;
import java.util.Scanner;

public class SkipLimitLogic {

    // skip(long n) - метод для пропуска n элементов.
    // Метод возвращает новый поток, в котором пропущены первые n элементов

    // limit(long n) - применяется для выборки первых n элементов потоков.
    // Этот метод также возрвращает модифицированный поток, в котором не более n элементов
    public void implementMethodSkip(List<String> models) {
        models.stream()
                .skip(2)
                .forEach(System.out::println);
    }

    public void implementPostNavigationUsingSkipAndLimit(List<String> models) {
        int pageSize = 3; // количество элементов на страницу
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Input number page: ");
            int page = scanner.nextInt();

            if (page < 1) break; // если число меньше 1, выходим из цикла

            models.stream()
                    .skip((long) (page - 1) * pageSize)
                    .limit(pageSize)
                    .forEach(System.out::println);
        }
    }
}
