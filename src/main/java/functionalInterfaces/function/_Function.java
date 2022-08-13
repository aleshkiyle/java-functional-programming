package functionalInterfaces.function;

import java.util.function.Function;

// Function<T,R> interface represents a function that accepts one argument and produces one result.
public class _Function {

    public static void main(String[] args) {

        FunctionLogic functionLogic = new FunctionLogic();
        // Function takes 1 argument and produces 1 result
        System.out.println("Increment number using imperative approach: ");
        int increment = functionLogic.incrementByOne(23);
        System.out.println(increment);

        System.out.println("Increment number using Function interface: ");
        Integer integerIncrement = functionLogic.incrementByOneFunction.apply(3);
        System.out.println(integerIncrement);

        System.out.println("Multiply number using Function interface: ");
        int multiply = functionLogic.multiplyBy10Function.apply(integerIncrement);
        System.out.println(multiply);

        System.out.println("Join increment function and multiply function: ");
        Function<Integer, Integer> addByOneAndMultiplyTenFunction =
                functionLogic.incrementByOneFunction
                        .andThen(functionLogic.multiplyBy10Function);
        System.out.println(addByOneAndMultiplyTenFunction.apply(4));

        // BiFunction takes 2 arguments and produces 1 result
        System.out.println("Using BiFunction interface: ");
        System.out.println(
                functionLogic.incrementByOneAndMultiply(4, 100)
        );
        System.out.println(
                functionLogic.incrementByOneAndMultiplyBiFunction.apply(4, 100)
        );
    }
}
