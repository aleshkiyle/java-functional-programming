package funcByMetanit.streamAPI.optional;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.Random;
import java.util.function.Consumer;

public class OptionalLogic implements OptionalLogicImpl {

    private static final Integer CONST_NUMBER_FOR_OR_ELSE_METHOD = -1;

    // Ряд операция сведения, такие как min, max, reduce возвращают объекты Optional<T>.
    // Этот объект фактически обёртывает результат операции.
    // После выполнения операции с помощью метода get() объекта Optional мы можем получить его значение:

    @Override
    public void implementOptionalFindMinNumberInList() {
        List<Integer> numbers = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9));
        List<Integer> emptyList = new ArrayList<>();
        Optional<Integer> min = numbers.stream().min(Integer::compare);
        Optional<Integer> min2 = emptyList.stream().min(Integer::compare);
        System.out.println(min.get());
        Consumer<Optional<Integer>> checkOptionalForEmptiness = OptionalLogic::checkOptionalForEmptiness;
        checkOptionalForEmptiness.accept(min2);
    }

    // Самый простой способ избежать выбрасывания NoSuchElementException - это предварительная
    // проверка наличия значения Optional с помощью метода isPresent(). Он возвращает true, если
    // значение присутствует в Optional, и false, если значение отсутствует
    private static void checkOptionalForEmptiness(Optional<Integer> number) {
        if (number.isPresent()) {
            System.out.println(number.get());
        } else {
            System.out.println("Optional object is empty!");
        }
    }

    @Override
    // Метод orELse(T other) позволяет определить альтернативное значение, которое будет возвращаться,
    // если Optional не получит из потока какого-нибудь значения
    public void implementMethodOrElseOptional(List<Integer> emptyList, List<Integer> numbers) {
        Optional<Integer> min = emptyList.stream()
                .min(Integer::compare);
        System.out.println(min.orElse(CONST_NUMBER_FOR_OR_ELSE_METHOD));

        Optional<Integer> max = numbers.stream()
                .max(Integer::compare);
        System.out.println(max.orElse(CONST_NUMBER_FOR_OR_ELSE_METHOD));
    }

    @Override
    // Метод orElseGet(Supplier supplier) - позволяет задать функцию, которая будет возвращать значение по умолчанию
    public void implementMethodOrElseGetOptional(List<Integer> numbers) {
        Optional<Integer> min = numbers.stream()
                .min(Integer::compare);
        Random random = new Random();
        System.out.println(min.orElseGet(() -> random.nextInt(100)));
    }


    @Override
    // Метод orElseThrow() - позволяет сгенерировать исключение, если Optional не содержит значения
    public void implementMethodOrElseThrow(List<Integer> numbers) {
        Optional<Integer> min = numbers.stream()
                .min(Integer::compare);
        System.out.println(min.orElseThrow(IllegalStateException::new));
    }

    @Override
    // Метод ifPresent() - определяет действия со значением в Optional, если значения имеется.
    // В метод ifPresent() передаётся функция, которая принимает один параметр - значение из Optional.
    // В данном случае полученное максимальное число выводится на консоль. Но если бы массив numbers был бы пустым,
    // и соответсвенно Optional не содеражло бы никакого значения, то никакой ошибки не было бы.
    public void implementMethodIfPresentOptional() {
        List<Integer> numbers = List.of(12, -5, 3, 134);
        Optional<Integer> max = numbers.stream()
                .max(Integer::compare);
        max.ifPresent(System.out::println);
    }

    @Override
    // Метод ifPresentOrElse(Consumer consumer, Runnable runnable) - позволяет определить альтернативную логику
    // на случай, есл изначение в Optional отсутствует. В метод ifPresentOrElse() - передаются две функции.
    // Первая обрабатывает значение в Optional, если оно присуствует.
    // Вторая функция представляет действие, которые выполняются, если значение в Optional отсутствует.
    public void implementMethodIfPresentOrElseOptional() {
        List<Integer> numbers = new ArrayList<>();
        Optional<Integer> min = numbers.stream()
                .min(Integer::compare);
        min.ifPresentOrElse(
                System.out::println,
                () -> System.out.println("Value not found")
        );
    }
}
