package funcByMetanit.streamAPI.filterMapFlatMap;

import funcByMetanit.streamAPI.util.Phone;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class FilterMapFlatMapILogic {

    private static final Integer NUMBERS_LETTERS_WORD = 6;



    public void implementFilterByCities(List<String> cities) {
        Predicate<String> cityPredicate = city -> city.length() == NUMBERS_LETTERS_WORD;
        cities.stream() // получаем поток
                .filter(cityPredicate) // применяем фильтр по длине строки
                .forEach(System.out::println); // выводим отфильтрованные строки на консоль
    }

    public void implementFilterPhonesByPrice(List<Phone> phones) {
        Predicate<Phone> phonePredicate = phone -> phone.getPrice() < 50000;
        phones.stream()
                .filter(phonePredicate)
                .forEach(System.out::println);
    }

    // <R> Stream<R> map(Function<? super T, ? extends R> mapper) - позвоялет задавать функцию преобразования одного объекта
    // в другой, то есть получить из элемента одного типа элемента другого типа.
    public void implementMapMethodOnlyNamePhones(List<Phone> phones) {
        phones.stream()
                .map(Phone::getName)// помещаем в поток только название телефонов
                .forEach(System.out::println);
    }

    public void implementMapMethodOutputNamePhonesAndPrices(List<Phone> phones) {
        phones.stream()
                .map(phone -> "Name: " + phone.getName() + ", price: " + phone.getPrice())
                .forEach(System.out::println);
    }

    // <R> Stream<R> flatMap(Function<? super T>, <? extends R> mapper) - плоское отображение выполняется тогда, когда
    // из одного элемента нужно получить несколько
    public void implementFlatMapMethodByDiscountPrice(List<Phone> phones) {
        phones.stream()
                .flatMap(phone -> Stream.of(
                        String.format("name: %s price without discount: %d", phone.getName(), phone.getPrice()),
                        String.format("name: %s discount price: %d", phone.getName(), phone.getPrice() - (int) (phone.getPrice() * 0.1))
                ))
                .forEach(System.out::println);
    }
}
