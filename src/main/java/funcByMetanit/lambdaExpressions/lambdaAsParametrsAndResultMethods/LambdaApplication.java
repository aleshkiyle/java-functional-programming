package funcByMetanit.lambdaExpressions.lambdaAsParametrsAndResultMethods;

import java.util.List;

public class LambdaApplication {

    public static void main(String[] args) {
        ExpressionHelper expressionHelper = new ExpressionHelper();
        Expression expressionEvenNumbers = number -> number % 2 == 0;
        Expression expressionPositiveNumbers = ExpressionHelper::isPositive;
        Expression expressionNegativeNumbers = expressionHelper::isNegative;
        List<Integer> numbers = List.of(-5, -4, -3, -2, -1, 0, 1, 2, 3, 4, 5);
        System.out.println("Sum of even list elements: " + sum(numbers, expressionEvenNumbers));
        System.out.println("Sum of positive elements: " + sum(numbers, expressionPositiveNumbers));
        System.out.println("Sum of negative elements: " + sum(numbers, expressionNegativeNumbers));
        System.out.println(mulNumbersWithExpression(numbers, expressionNegativeNumbers));
    }

    private static Integer sum(List<Integer> numbers, Expression expression) {
        int result = 0;
        for (Integer number: numbers) {
            if (expression.isEqual(number)) {
                result += number;
            }
        }
        return result;
    }

    private static Integer mulNumbersWithExpression(List<Integer> numbers, Expression expression) {
        Integer result = 1;
        for (Integer number: numbers) {
            if (expression.isEqual(number)) {
               result *= number;
            }
        }
        return result;
    }
}
