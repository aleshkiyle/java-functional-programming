package funcByMetanit.streamAPI.reduce;

import funcByMetanit.lambdaExpressions.Printable;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Collections;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.function.BiPredicate;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Streams {

    @BeforeEach
    void setUp() {
        Cat cat1 = new Cat("Umka", 2);
        Cat cat2 = new Cat("Kuza", 12);
    }

    @Test
    public void testMethod() {
        Streams streams = new Streams();
        Assertions.assertEquals(19 + 2,  21);
        Stream<Integer> integerStream = Stream.of(-44, 3, -5, 0, 12);
        Predicate<Integer> predicate1 = Streams::test;
        Predicate<Integer> predicate2 = Streams::test2;
        Predicate<Integer> predicate3 = streams::test3;
        List<Integer> collect = integerStream.collect(Collectors.toList());
        collect.removeIf(predicate1);
        collect.forEach(System.out::println);
        List<Integer> integers = new CopyOnWriteArrayList<>();
        Collections.addAll(integers, 1, 2, 3, 4, 5, 6, 7, 8, 9);
        integers.removeIf(Predicate.not(number -> number % 2 == 0));
        integers.forEach(System.out::println);
        BiPredicate<String, Integer> biPredicate1 = (str, num) -> str.length() < num + 3;
        BiPredicate<String, Integer> biPredicate2 = (str, num) -> str.length() > num - 3;

        String message = "Hello";

        boolean resultSumBiPredicates = biPredicate1.and(biPredicate2).test(message, 3);
        System.out.println(resultSumBiPredicates);
        String text = "I, am: hello";
        String[] split = text.split(",");
        for (String symbol : split) {
            System.out.println(symbol);
        }
    }

    @Test
    public void testJoinBiPredicate() {
        BiPredicate<String, Integer> biPredicate1 = (str, num) -> str.length() < num + 3;
        BiPredicate<String, Integer> biPredicate2 = (str, num) -> str.length() > num - 3;

        String message = "Hello";
        Assertions.assertTrue(biPredicate1.and(biPredicate2).test(message, 3));
    }

    private static boolean test(Integer num) {
        return num < 0;
    }

    private static boolean test2(Integer num) {
        return num % 2 == 0;
    }

    private boolean test3(Integer num) {
        return num > 0 && num % 2 == 1;
    }
}

class Cat {

    private String name;
    private int age;

    public Cat(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
