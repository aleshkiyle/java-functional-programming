package funcByMetanit.lambdaExpressions.algorithmsLineReversal;

import java.util.function.Function;

public class StringReverseRunner {

    private static final String REVERSED_STRING = "wocsoM";
    private static final String REVERSED_NAME = "yexelA";
    private static final String NONE = "enoN";

    public static void main(String[] args) {
        System.out.println(stringReverseRunner.reverseString(REVERSED_STRING));
        System.out.println(reverseString.apply(REVERSED_STRING));
        System.out.println(reverseStringWithChartAt.apply(NONE));
        System.out.println(getReverseStringWithCharArray.apply(REVERSED_NAME));
    }

    private static final StringReverseReturner stringReverseRunner =
            str -> new StringBuilder(str).reverse().toString();

    private static final Function<String, String> reverseString =
            str -> new StringBuilder(str).reverse().toString();

    private static final Function<String, String> reverseStringWithChartAt =
            str -> {
                StringBuilder res = new StringBuilder();
                for (int i = 0; i < str.length(); i++) {
                    res.insert(0, str.charAt(i));
                }
                return res.toString();
            };

    private static final Function<String, String> getReverseStringWithCharArray =
            inputString -> {
                char[] chars = inputString.toCharArray();
                StringBuilder result = new StringBuilder();
                for (int i = chars.length - 1; i >=0; i--) {
                    result.append(chars[i]);
                }
                return result.toString();
            };
}
