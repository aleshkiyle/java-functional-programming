package optional;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Random;

        /* Объект-контейнер,который может содержать или не содержать незначение.Если значение присутствует,isPresent()возвращает true.
        Если значение отсутствует,объект считается пустым,а isPresent()возвращает false.

        Предоставляются дополнительные методы,которые зависят от наличия или отсутствия содержащегося значения,
        такие как orElse()(возвращает значение по умолчанию,если значение отсутствует)и ifPresent()
        (выполняет действие,если значение присутствует).

        Это класс,основанный на ценности;программисты должны рассматривать одинаковые экземпляры как взаимозаменяемые
        и не должны использовать экземпляры для синхронизации,иначе может произойти непредсказуемое поведение.
        Например,в будущем выпуске может произойти сбой синхронизации.

        Примечание к интерфейсу прикладного программирования.Необязательный в первую очередь предназначен
        для использования в качестве типа возвращаемого значения метода,когда существует явная необходимость
        отображать «нет результата» и где использование NULL может вызвать ошибку.Переменная типа Optional
        никогда не должна быть нулевой;он всегда должен указывать на необязательный экземпляр.

        с:1.8
        Параметры типа:<T> -тип значения.
         */

public class OptionalRunner {

    public static void main(String[] args) {

        // Ряд операций сведения, такие как min, max, reduce возвращют объект Optional<T>.
        // Этот объект фактически обёртывает результат операции.
        // После выполнения операции с помощью метода get() объект Optional мы можем получить его значение:

        List<Integer> numbers = new ArrayList<>();
        OptionalInitializer initializer = new OptionalInitializer(numbers);

        OptionalLogic optionalLogic = new OptionalLogic(numbers, List.of());
        optionalLogic.implementOrElseMethod(initializer.getNumbers());
        optionalLogic.implementMethodOrElseGet(initializer.getNumbers());
        optionalLogic.implementMethodOrElseThrow(initializer.getNumbers());
        optionalLogic.implementMethodIfPresent(initializer.getNumbers());
        optionalLogic.implementMethodIfPresentOrElse(initializer.getNumbers());
    }
}
