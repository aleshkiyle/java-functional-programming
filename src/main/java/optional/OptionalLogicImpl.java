package optional;

import java.util.List;

public interface OptionalLogicImpl {

    // Метод позволяет определить альтернативное значение , которое будет возвращаться, если Optional не получит
    // из потока какого-нибудь значения
    void implementOrElseMethod(List<Integer> numbers);

    // Метод, позволяющий задавать функцию, которая будет возвращать значение по умолчанию
    void implementMethodOrElseGet(List<Integer> numbers);

    // Метод, позволяющий сгенерировать исключение, если Optional не содержит значения
    void implementMethodOrElseThrow(List<Integer> numbers);

    // Метод определеяет действия со значением в Optional, если оно имеется
    void implementMethodIfPresent(List<Integer> numbers);

    // Метод позволяет определить альтернативную логику на случай, если в Optional отстуствует значение
    void implementMethodIfPresentOrElse(List<Integer> numbers);
}
