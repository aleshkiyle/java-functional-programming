package funcByMetanit.streamAPI.parallelOperationsOnArrays;

import funcByMetanit.streamAPI.parallelOperationsOnArrays.data.Phone;

import java.util.Arrays;
import java.util.function.Consumer;
import java.util.function.Function;

public class ParallelOperationsOnArraysRunner {

    private static final Phone[] PHONES = new Phone[] {
            new Phone("Iphone 8", 45000),
            new Phone("Pixel 2", 45000),
            new Phone("Samsung Galaxy S9", 40000),
            new Phone("Nokia 9", 32000)
    };

    private static final int[] NUMBERS =
            {30, -4, 5, 29, 7, -8};

    public static void main(String[] args) {

        System.out.println("Implement parallelSetAll method Arrays:");
        ParallelOperationsOnArraysLogic parallelOperationsOnArraysLogic = new ParallelOperationsOnArraysLogic();
        Function<Integer, int[]> initializeArray =
                parallelOperationsOnArraysLogic::initializeArray;
        Arrays.stream(initializeArray.apply(6))
                .forEach(System.out::println);
        System.out.println("---------------------------------");

        System.out.println("Implement Arrays.parallelSetAll with objects array: ");
        Consumer<Phone[]> consumerManipulationObjectsPhones =
                parallelOperationsOnArraysLogic::getPhonesWithDiscount;
        consumerManipulationObjectsPhones.accept(PHONES);
        System.out.println("-------------------------");

        System.out.println("Implement parallelSort method: ");
        Consumer<int[]> consumerImplementSortArray =
                parallelOperationsOnArraysLogic::implementParallelSort;
        consumerImplementSortArray.accept(NUMBERS);
        System.out.println(Arrays.toString(NUMBERS));
        System.out.println("-----------------------------");

        System.out.println("Implement sort phones with phone comparator:");
        Consumer<Phone[]> consumerArraysParallelSortWithPhoneComparator =
                parallelOperationsOnArraysLogic::implementSortPhoneWithPhoneComparator;
        consumerArraysParallelSortWithPhoneComparator.accept(PHONES);
        Arrays.stream(PHONES).forEach(System.out::println);

        System.out.println("Implement Arrays.parallelPrefix: ");
        parallelOperationsOnArraysLogic.implementParallelPrefixMethod(NUMBERS);
    }
}
