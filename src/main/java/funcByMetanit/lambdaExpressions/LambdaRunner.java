package funcByMetanit.lambdaExpressions;

public class LambdaRunner {

    private static final Integer FIRST_NUMBER = 3;
    private static final Integer SECOND_NUMBER = -33;
    private static final Integer NULL_NUMBER = 0;
    private static final String FIRST_STRING = "Alexey + ";
    private static final String SECOND_STRING = "Nasty = ♥LOVE♥";


    public static void main(String[] args) {
        LambdaLogic lambdaLogic = new LambdaLogic();
        System.out.println("Sum numbers: " + FIRST_NUMBER + " + " + "(" + SECOND_NUMBER +  ") = "
                + lambdaLogic.sumNumbersWithOperationableInterface(FIRST_NUMBER, SECOND_NUMBER));
        System.out.println("Mul numbers : " + FIRST_NUMBER + " * " + "(" + SECOND_NUMBER + ") = "
                + lambdaLogic.mulNumbersWithOperationableInterface(FIRST_NUMBER, SECOND_NUMBER));
        System.out.println("Div numbers : " + "(" + SECOND_NUMBER + ") / " + FIRST_NUMBER + " = "
                + lambdaLogic.divNumbersWithOperationableInterface(SECOND_NUMBER, NULL_NUMBER));
        lambdaLogic.printStringWithPrintableInterface("Hello from Printable Interface");

        // Generic functional interface
        lambdaLogic.sumNumbersWithOperationableGenericsInterface(FIRST_NUMBER, SECOND_NUMBER, FIRST_STRING, SECOND_STRING);
    }
}
