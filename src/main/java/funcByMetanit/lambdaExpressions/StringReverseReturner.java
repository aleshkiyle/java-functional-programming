package funcByMetanit.lambdaExpressions;

@FunctionalInterface
public interface StringReverseReturner {

    StringBuilder reverseString(StringBuilder str);
}

class StringReturnerRunner {

    public static void main(String[] args) {
        StringReverseReturner returner = StringBuilder::reverse;
        System.out.println(returner.reverseString(new StringBuilder("ekoJ")));
    }
}
