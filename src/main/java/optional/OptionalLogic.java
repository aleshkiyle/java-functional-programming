package optional;

import java.util.List;
import java.util.Optional;
import java.util.Random;

public class OptionalLogic implements OptionalLogicImpl {

    private static final Integer CONST_NUMBER = -1;

    private final List<Integer> numbers;
    private final List<Integer> emptyList;

    public OptionalLogic(List<Integer> numbers, List<Integer> emptyList) {
        this.numbers = numbers;
        this.emptyList = emptyList;
    }

    @Override
    public void implementOrElseMethod(List<Integer> numbers) {
        List<Integer> emptyList = List.of();
        Optional<Integer> min = emptyList.stream().min(Integer::compare);
        System.out.println(min.orElse(CONST_NUMBER));


        Optional<Integer> min1 = numbers.stream().min(Integer::compare);
        System.out.println(min1.orElse(CONST_NUMBER));
    }

    @Override
    public void implementMethodOrElseGet(List<Integer> numbers) {
        Optional<Integer> min = numbers.stream().min(Integer::compare);
        Random random = new Random();
        System.out.println(min.orElseGet(() -> random.nextInt(100)));
    }

    @Override
    public void implementMethodOrElseThrow(List<Integer> numbers) {
        Optional<Integer> min = numbers.stream().min(Integer::compare);
        System.out.println(min.orElseThrow(
                IllegalStateException::new
        ));
    }

    @Override
    public void implementMethodIfPresent(List<Integer> numbers) {
        Optional<Integer> min = numbers.stream().min(Integer::compare);
        min.ifPresent(
                System.out::println
        );
    }

    @Override
    public void implementMethodIfPresentOrElse(List<Integer> numbers) {
        Optional<Integer> min = numbers.stream().max(Integer::compare);
        min.ifPresentOrElse(
                System.out::println,
                () -> System.out.println("No such element")
        );
    }
}
