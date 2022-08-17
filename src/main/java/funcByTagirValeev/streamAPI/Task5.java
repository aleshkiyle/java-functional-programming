package funcByTagirValeev.streamAPI;

import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Task5 {

    private static final Integer NUMBER_REPETITIONS = 3;


    // Оставить значения, которые повтоярются не менее n раз.

    public static void main(String[] args) {
        List<String> conferences = List.of("Jpoint", "Joker", "JBreak",
                "JBreak", "Joker", "JBreak");
        BiConsumer<List<String>, Integer> leaveValuesTharRepeatAtLeastNTimes =
                Task5::leaveValuesTharRepeatAtLeastNTimes;
        leaveValuesTharRepeatAtLeastNTimes.accept(conferences, NUMBER_REPETITIONS);
        conferences.stream()
                .dropWhile(conference -> conference.length() == 6)
                .forEach(System.out::println);
    }

    private static void leaveValuesTharRepeatAtLeastNTimes(List<String> conferences, int numberRepetitions) {
        Map<String, Long> count = conferences.stream()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        count.values().removeIf(cnt -> cnt < numberRepetitions);
        count.keySet().forEach(System.out::println);
    }

}