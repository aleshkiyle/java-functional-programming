package functionalInterfaces.function;

import java.util.function.BiFunction;
import java.util.function.Function;

// Function<T,R> interface represents a function that accepts one argument and produces one result.
public class _Function {

    public static void main(String[] args) {

        // Function takes 1 argument and produces 1 result
        System.out.println("Increment number using imperative approach: ");
        int increment = incrementByOne(23);
        System.out.println(increment);

        System.out.println("Increment number using Function interface: ");
        Integer integerIncrement = incrementByOneFunction.apply(3);
        System.out.println(integerIncrement);

        System.out.println("Multiply number using Function interface: ");
        int multiply = multiplyBy10Function.apply(integerIncrement);
        System.out.println(multiply);

        System.out.println("Join increment function and multiply function: ");
        Function<Integer, Integer> addByOneAndMultiplyTenFunction =
                incrementByOneFunction.andThen(multiplyBy10Function);
        System.out.println(addByOneAndMultiplyTenFunction.apply(4));

        // BiFunction takes 2 arguments and produces 1 result
        System.out.println("Using BiFunction interface: ");
        System.out.println(
                incrementByOneAndMultiply(4, 100)
        );
        System.out.println(
                incrementByOneAndMultiplyBiFunction.apply(4, 100)
        );
    }


    private static final Function<Integer, Integer> incrementByOneFunction =
            number -> number + 1;

    private static final Function<Integer, Integer> multiplyBy10Function =
            number -> number * 10;

    private static int incrementByOne(int number) {
        return number + 1;
    }

    private static final BiFunction<Integer, Integer, Integer> incrementByOneAndMultiplyBiFunction =
            (number, numToMultiplyBy) -> (number + 1) * numToMultiplyBy;

    private static int incrementByOneAndMultiply(int number, int numToMultiplyBy) {
        return (number + 1) * numToMultiplyBy;
    }
}
