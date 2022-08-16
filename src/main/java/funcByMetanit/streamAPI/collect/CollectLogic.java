package funcByMetanit.streamAPI.collect;

import funcByMetanit.streamAPI.collect.data.Phone;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class CollectLogic implements CollectLogicImpl {

    @Override
    public void implementMethodCollectToList(List<String> phones) {
        Predicate<String> phonePredicate = phone -> phone.length() < 10;

        List<String> filteredPhones = phones.stream()
                .filter(phonePredicate)
                .collect(Collectors.toList());

        filteredPhones.forEach(System.out::println);
    }

    @Override
    public void implementMethodCollectToSet(List<String> phones) {
        Predicate<String> predicatePhone = phone -> phone.contains("6");
        Set<String> sortedPhones = phones.stream()
                .filter(predicatePhone)
                .collect(Collectors.toSet());
        sortedPhones.forEach(System.out::println);
    }

    @Override
    public void implementMethodCollectToMap(Stream<Phone> phoneStream) {
        Map<String, Integer> phones = phoneStream
                .collect(Collectors.toMap(
                        Phone::getName,
                        Phone::getPrice
                ));
        phones.forEach((key, value) -> System.out.println("Phone= {name: " + key + ", price: " + value + " }"));
    }

    @Override
    public void implementMethodCollectCreateHashSet(Stream<String> phoneStream) {
        Predicate<String> phonePredicate = phone -> phone.length() < 12;
        HashSet<String> hashSetPhones = phoneStream
                .filter(phonePredicate)
                .collect(Collectors.toCollection(HashSet::new));

        hashSetPhones.forEach(System.out::println);
    }

    // Вторая форма collect(Supplier supplier, BiConsumer biConsumer, BiConsumer combiner) имеет три параметра
    // ! supplier - создаёт объект коллекции
    // ! biConsumer - добавляет элемент в коллекцию
    // ! combiner - бинарная функция, которая объединяет два объекта
    @Override
    public void implementSecondFormMethodCollect(List<String> phones) {
        Predicate<String> phonePredicate = phone -> phone.length() < 10;

        List<String> filteredPhones = phones.stream()
                .filter(phonePredicate)
                .collect(
                        ArrayList::new, // создаём ArrayList
                        ArrayList::add, // добавляем в список элемент
                        ArrayList::addAll // добавляем в список другой список
                );

        /* ArrayList<String> filteredPhones = phones.filter(phonePredicate)
                .collect(
                        () -> new ArrayList<String>(), // создаём ArrayList
                        (list, element) -> list.add(element), // добавляем в список элемент
                        (list1, list2) -> list1.addAll(list2) // добавляем в список другой список
                );
         */

        System.out.println(filteredPhones.getClass());
        filteredPhones.forEach(System.out::println);
    }
}
