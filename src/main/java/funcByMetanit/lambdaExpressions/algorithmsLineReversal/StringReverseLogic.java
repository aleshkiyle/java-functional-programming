package funcByMetanit.lambdaExpressions.algorithmsLineReversal;

import java.util.Stack;
import java.util.function.Function;

public class StringReverseLogic {

    private static final String SEPARATOR = " /|/ ";

    public String runMethodsByReverseString(String inputString) {
        return stringReverseRunner.reverseString(inputString)  + SEPARATOR +
                reverseString.apply(inputString) + SEPARATOR +
                reverseStringWithChartAt.apply(inputString) + SEPARATOR +
                getReverseStringWithCharArray.apply(inputString) + SEPARATOR +
                reverseStringWithStack.apply(inputString);

    }

    private final StringReverseReturner stringReverseRunner =
            str -> new StringBuilder(str).reverse().toString();

    private final Function<String, String> reverseString =
            str -> new StringBuilder(str).reverse().toString();

    private final Function<String, String> reverseStringWithChartAt =
            str -> {
                StringBuilder res = new StringBuilder();
                for (int i = 0; i < str.length(); i++) {
                    res.insert(0, str.charAt(i));
                }
                return res.toString();
            };

    private final Function<String, String> getReverseStringWithCharArray =
            inputString -> {
                char[] chars = inputString.toCharArray();
                StringBuilder result = new StringBuilder();
                for (int i = chars.length - 1; i >= 0; i--) {
                    result.append(chars[i]);
                }
                return result.toString();
            };

    private final Function<String, String> reverseStringWithStack =
            str -> {
                Stack<Character> stack = new Stack<>();
                StringBuilder result = new StringBuilder();
                for (Character character: str.toCharArray()) {
                    stack.add(character);
                }
                while (!stack.isEmpty()) {
                    result.append(stack.pop());
                }
                return result.toString();
            };
}
