package funcByMetanit.lambdaExpressions.algorithmsLineReversal;

public class StringReverseRunner {

    private static final String REVERSED_STRING = "wocsoM";
    private static final String REVERSED_NAME = "yexelA";
    private static final String NONE = "enoN";

    public static void main(String[] args) {
        StringReverseLogic stringReverseLogic = new StringReverseLogic();
        System.out.println(stringReverseLogic.runMethodsByReverseString(REVERSED_STRING));
        System.out.println(stringReverseLogic.runMethodsByReverseString(REVERSED_NAME));
        System.out.println(stringReverseLogic.runMethodsByReverseString(NONE));
    }
}
