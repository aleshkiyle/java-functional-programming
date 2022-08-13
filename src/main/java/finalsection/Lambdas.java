package finalsection;

public class Lambdas {

    public static void main(String[] args) {

        Integer number = null;
        // int counter = 0; - primitive types not used in Functional programming in Java

        LambdasService lambdasService = new LambdasService();
        System.out.println(lambdasService.upperCaseName.apply("alex", number));
    }
}
