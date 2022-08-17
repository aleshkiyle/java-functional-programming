package funcByMetanit.streamAPI.grouping;

import funcByMetanit.streamAPI.grouping.data.Phone;

import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class GroupingRunner {

    private static final List<Phone> PHONES = List.of(
            new Phone("Iphone X", "Apple", 600),
            new Phone("Pixel 2", "Google", 500),
            new Phone("Iphone 8", "Apple", 450),
            new Phone("Galaxy S9", "Samsung", 440),
            new Phone("Galaxy S8", "Samsung", 340)
    );

    public static void main(String[] args) {
        System.out.println("Implement method groupingBy() by company:");
        GroupingLogic groupingLogic = new GroupingLogic();
        Consumer<Stream<Phone>> consumerImplementGroupingByPhonesStream
                = groupingLogic::implementGroupingByMethod;
        consumerImplementGroupingByPhonesStream.accept(PHONES.stream());
        System.out.println("________________________________________");

        System.out.println("Implement method partitioningBy(): ");
        Consumer<List<Phone>> consumerImplementPartitioningByMethod
                = groupingLogic::implementPartitioningByMethodByAppleCompany;
        consumerImplementPartitioningByMethod.accept(PHONES);
        System.out.println("____________________________________");

        System.out.println("Implement method Collectors.counting():");
        Consumer<List<Phone>> consumerByCollectorsCounting
                = groupingLogic::implementMethodCollectorsCounting;
        consumerByCollectorsCounting.accept(PHONES);
        System.out.println("-__-_-____-____-__-_-_-_-------_-_-__-");

        System.out.println("Implement method Collectors.summing():");
        Consumer<List<Phone>> consumerByCollectorsSumming
                = groupingLogic::implementMethodCollectorsSumming;
        consumerByCollectorsSumming.accept(PHONES);
        System.out.println("----------------------------------");

        System.out.println("Implement method minBy: ");
        Consumer<List<Phone>> consumerMinByAndMaxByMethods = groupingLogic::implementMethodsMaxByAndMinBy;
        consumerMinByAndMaxByMethods.accept(PHONES);
        System.out.println("--------------------------");

        System.out.println("Implement method summarizingInt:");
        Consumer<List<Phone>> consumerSummarizing = groupingLogic::implementMethodSummarizing;
        consumerSummarizing.accept(PHONES);
        System.out.println("-----------------------------------");

        System.out.println("Implement method Collectors.mapping(): ");
        Consumer<List<Phone>> consumerMethodCollectorsMapping =
                groupingLogic::implementMethodMapping;
        consumerMethodCollectorsMapping.accept(PHONES);
        System.out.println("--------------------------------------");
    }
}
