package funcByMetanit.lambdaExpressions.lambdaAsParametrsAndResultMethods;

// Начиная с JDK 8 в Java в качестве параметра можно передавать ссылку на другой метод.
// В принципе данный сопособ аналогичен передаче в метод лямбда-выражения
public class ExpressionHelper {

    static boolean isEven(int number) {
        return number % 2 == 0;
    }

    static boolean isNotEven(int number) {
        return number % 2 == 1;
    }

    static boolean isPositive(int number) {
        return  number > 0;
    }

    boolean isNegative(int number) {
        return number < 0;
    }
}
