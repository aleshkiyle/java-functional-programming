package funcByMetanit.streamAPI.mixingOperations;

import funcByMetanit.streamAPI.mixingOperations.util.Phone;

import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;

public class MixingOperationsLogic {

    // Операции сведения представляют терминальные операции, которые возвращают некоторое значение
    // - результат операции. В Stream API есть ряд операций сведения.

    // long count() - вовзращает количество элементов в потоке данных
    public long implementMethodCountStreamAPI(List<String> names) {
        return names.stream()
                .count();
    }

    public long implementMethodCountStreamAPI(List<String> names, Predicate<String> predicate) {
        return names.stream()
                .filter(predicate)
                .count();
    }

    // Optional<T> findFirst() - извлекает из потока первый элемент
    public Optional<String> implementMethodFindFirstStreamAPI(List<String> names) {
        return names.stream()
                .findFirst();
    }

    // Optional<T> findAny() - извлекат случайный объект из потока (нередко тоже первый)
    public Optional<String> implementMethodFindAnyStreamAPI(List<String> names) {
        return names.stream()
                .findAny();
    }

    // boolean allMatch(Predicate predicate) - возвращает true, если все
    // элементы потока удовлетворяют услвоию в предикате
    public boolean implementMethodAllMatch(List<String> names, Predicate<String> predicateForAllMatch) {
        return names.stream()
                .allMatch(predicateForAllMatch);
    }

    // boolean anyMatch(Predicate predicate) - вовзрщает true, если хотя бы
    // один элемент потока удовлетворяет услвоию в предикате
    public boolean implementMethodAnyMatch(List<String> names, Predicate<String> predicateForAnyMatch) {
        return names.stream()
                .anyMatch(predicateForAnyMatch);
    }


    // boolean noneMatch(Predicate predicate) - возвращет true, елси ни один
    // из элементов в потоке не удовлетворяет условию в предикате
    public boolean implementMethodNoneMatch(List<String> names, Predicate<String> predicateForNoneMatch) {
        return names.stream()
                .noneMatch(predicateForNoneMatch);
    }

    // Optional<T> min(Comparator comparator) - возвращает минимальное значение из потока
    public Optional<Integer> implementMethodMinStreamAPI(List<Integer> numbers) {
        return numbers.stream()
                .min(Integer::compare);
    }

    // Optional<T> max(Comparator comparator) - возвращает максимальное значение из потока
    public Optional<Integer> implementMethodMaxStreamAPI(List<Integer> numbers) {
        return numbers.stream()
                .max(Integer::compare);
    }

    public Optional<Phone> implementMethodMinByLowCostPhone(List<Phone> phones) {
        return phones.stream()
                .min(Phone::compare);
    }

    public Optional<Phone> implementMethodMaxByTopCostPhone(List<Phone> phones) {
        return phones.stream()
                .max(Phone::compare);
    }

}
