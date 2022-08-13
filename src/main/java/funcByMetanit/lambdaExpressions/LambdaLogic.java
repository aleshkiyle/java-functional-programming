package funcByMetanit.lambdaExpressions;

public class LambdaLogic {

    private Operationable operationable;
    private OperationableGenerics<Integer> integerOperationableGenerics;
    private OperationableGenerics<String> stringOperationableGenerics;

    public int sumNumbersWithOperationableInterface(Integer number1, Integer number2) {
        this.operationable = Integer::sum;

        return operationable.calculate(number1, number2);
    }

    public void sumNumbersWithAnonymousClass(Integer number1, Integer number2) {
        this.operationable = new Operationable() {
            @Override
            public int calculate(int x, int y) {
                return x + y;
            }
        };
    }

    public int mulNumbersWithOperationableInterface(Integer number1, Integer number2) {
        this.operationable = (num1, num2) -> num1 * num2;

        return operationable.calculate(number1, number2);
    }

    public int divNumbersWithOperationableInterface(Integer number1, Integer number2) {
        this.operationable = (num1, num2) -> {
            if (num2 == 0) {
                return 0;
            } else {
                return num1/num2;
            }
        };
        return operationable.calculate(number1, number2);
    }

    public void sumNumbersWithOperationableGenericsInterface(Integer number1, Integer number2, String string1, String string2) {
        this.integerOperationableGenerics = (Integer num1, Integer num2) -> num1 + num2;
        this.stringOperationableGenerics = (String str1, String str2) -> str1 + str2;

        System.out.println(integerOperationableGenerics.calculate(number1, number2));
        System.out.println(stringOperationableGenerics.calculate(string1, string2));
    }

    public void printStringWithPrintableInterface(String str) {
        Printable printable = System.out::println;

        printable.print(str);
    }
}
