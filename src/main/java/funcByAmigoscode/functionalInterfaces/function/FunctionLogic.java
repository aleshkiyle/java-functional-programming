package funcByAmigoscode.functionalInterfaces.function;

import java.util.function.BiFunction;
import java.util.function.Function;

public class FunctionLogic {

    public final Function<Integer, Integer> incrementByOneFunction =
            number -> number + 1;

    public final Function<Integer, Integer> multiplyBy10Function =
            number -> number * 10;

    public int incrementByOne(int number) {
        return number + 1;
    }

    public final BiFunction<Integer, Integer, Integer> incrementByOneAndMultiplyBiFunction =
            (number, numToMultiplyBy) -> (number + 1) * numToMultiplyBy;

    public int incrementByOneAndMultiply(int number, int numToMultiplyBy) {
        return (number + 1) * numToMultiplyBy;
    }
}
