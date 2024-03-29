package funcByMetanit.streamAPI.grouping;

import funcByMetanit.streamAPI.grouping.data.Phone;

import java.util.Comparator;
import java.util.IntSummaryStatistics;
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

        for (Map.Entry<String, Optional<Phone>> item : phoneMinByPrice.entrySet()) {

            StringBuilder stringBuilder = new StringBuilder();
            System.out.println(stringBuilder.append(item.getKey()).append(" - ").append(item.getValue().get().getName()));
        }

        Map<String, Optional<Phone>> phoneByMaxPrice = phones.stream()
                .collect(Collectors.groupingBy(Phone::getCompany,
                        Collectors.maxBy(Comparator.comparing(Phone::getPrice))));

        System.out.println("Implement method maxBy: ");
        for (Map.Entry<String, Optional<Phone>> item : phoneByMaxPrice.entrySet()) {

            StringBuilder stringBuilder = new StringBuilder();
            System.out.println(stringBuilder.append(item.getKey()).append(" - ").append(item.getValue()
                    .orElse(new Phone("Iphone 12 pro", "Apple", 1000))
                    .getName()));
        }
    }

    @Override
    public void implementMethodSummarizing(List<Phone> phones) {
        Map<String, IntSummaryStatistics> priceSummary = phones.stream()
                .collect(Collectors.groupingBy(Phone::getCompany,
                        Collectors.summarizingInt(Phone::getPrice)));

        for (Map.Entry<String, IntSummaryStatistics> item: priceSummary.entrySet()) {
            System.out.println(item.getKey() + " - " + item.getValue().getAverage());
        }

        Map<String, IntSummaryStatistics> phoneSummaryStatics = phones.stream()
                .collect(Collectors.groupingBy(Phone::getCompany, Collectors.summarizingInt(
                        Phone::getPrice
                )));

        StringBuilder stringBuilder = new StringBuilder();
        for (Map.Entry<String, IntSummaryStatistics> item: phoneSummaryStatics.entrySet()) {
            stringBuilder.append(item.getKey()).append(" - ").append(item.getValue().getSum());
        }
        System.out.println(stringBuilder);
    }

    @Override
    public void implementMethodMapping(List<Phone> phones) {
        Map<String, List<String>> phonesByCompany = phones.stream()
                .collect(Collectors.groupingBy(Phone::getCompany,
                        Collectors.mapping(Phone::getName, Collectors.toList())));

        for (Map.Entry<String, List<String>> item: phonesByCompany.entrySet()) {
            System.out.println(item.getKey() + ": ");
            item.getValue().forEach(System.out::println);
        }
    }
}
