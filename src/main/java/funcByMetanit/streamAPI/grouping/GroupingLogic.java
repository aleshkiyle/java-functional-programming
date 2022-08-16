package funcByMetanit.streamAPI.grouping;

import funcByMetanit.streamAPI.grouping.data.Phone;

import javax.xml.transform.sax.SAXSource;
import java.util.Comparator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class GroupingLogic implements GroupingLogicImpl {

    private static final String APPLE_COMPANY = "Apple";


    @Override
    public void implementGroupingByMethod(Stream<Phone> phoneStream) {

        Map<String, List<Phone>> phonesByCompany = phoneStream
                .collect(Collectors.groupingBy(Phone::getCompany));

        for (Map.Entry<String, List<Phone>> item : phonesByCompany.entrySet()) {

            System.out.println(item.getKey());

            item.getValue().forEach(System.out::println);

            System.out.println();
        }
    }

    @Override
    public void implementPartitioningByMethodByAppleCompany(List<Phone> phones) {
        Map<Boolean, List<Phone>> groupPhonesByApple = phones.stream()
                .collect(Collectors.partitioningBy(phone -> Objects.equals(phone.getCompany().toUpperCase(Locale.ROOT)
                        , APPLE_COMPANY.toUpperCase(Locale.ROOT))));

        for (Map.Entry<Boolean, List<Phone>> item : groupPhonesByApple.entrySet()) {
            System.out.println("Apple company is " + item.getKey());
            item.getValue().forEach(System.out::println);
            System.out.println();
        }
    }

    // Метод Collectors.counting применяется в Collectors.groupingBy() для вычисления элементов в каждой группе
    @Override
    public void implementMethodCollectorsCounting(List<Phone> phones) {
        Map<String, Long> phonesByCompany = phones.stream()
                .collect(Collectors.groupingBy(Phone::getCompany, Collectors.counting()));

        for (Map.Entry<String, Long> item : phonesByCompany.entrySet()) {
            System.out.println(item.getKey() + " - " + item.getValue());
        }
    }

    // Метод Collectors.summing() применяется для подсчёта суммы. 
    // В зависимости от типа данных, к которым применяется мметод, он имеет
    // следующие формы: summingInt(), summingLong(), summingDouble()
    // С помощью выражения Collectors.summingInt(Phone::getPrice) мы указываем, что для каждой 
    // компании будет вычислять совокупная цена всех её смартфонов. И поскольку вычисляется 
    // результат - сумма для всех значений типа int, то в качестве типа вовзвращаемой 
    // коллекции используется Map<String, Integer>
    @Override
    public void implementMethodCollectorsSumming(List<Phone> phones) {
        Map<String, Integer> phonesCompanyByPrice = phones.stream()
                .collect(Collectors.groupingBy(Phone::getCompany, Collectors.summingInt(Phone::getPrice)));

        for (Map.Entry<String, Integer> item : phonesCompanyByPrice.entrySet()) {
            System.out.println(item.getKey() + " - " + item.getValue());
        }
    }

    @Override
    public void implementMethodsMaxByAndMinBy(List<Phone> phones) {
        Map<String, Optional<Phone>> phoneMinByPrice = phones.stream()
                .collect(Collectors.groupingBy(Phone::getCompany,
                        Collectors.minBy(Comparator.comparing(Phone::getPrice))));

        for (Map.Entry<String, Optional<Phone>> item: phoneMinByPrice.entrySet()) {

            System.out.println(item.getKey());
            item.getValue().ifPresentOrElse(
                    System.out::println,
                    () -> System.out.println("phone not found")
            );
            System.out.println();
        }

        Map<String, Optional<Phone>> phoneByMaxPrice = phones.stream()
                .collect(Collectors.groupingBy(Phone::getCompany,
                        Collectors.maxBy(Comparator.comparing(Phone::getPrice))));

        for (Map.Entry<String, Optional<Phone>> item: phoneByMaxPrice.entrySet()) {
            System.out.println(item.getKey());
            item.getValue().ifPresentOrElse(
                    System.out::println,
                    () -> System.out.println("Value phone not found")
            );
            System.out.println();
        }
    }

    @Override
    public void implementMethodSummarizing(List<Phone> phones) {
        // TODO: 16.08.2022  
    }

    @Override
    public void implementMethodMapping(List<Phone> phones) {
        // TODO: 16.08.2022  
    }
}
