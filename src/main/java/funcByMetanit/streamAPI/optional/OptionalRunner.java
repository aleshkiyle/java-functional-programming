package funcByMetanit.streamAPI.optional;

import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class OptionalRunner {

    public static void main(String[] args) {
        OptionalLogic optionalLogic = new OptionalLogic();
        optionalLogic.implementOptionalFindMinNumberInList();
        System.out.println("Implement method orElse(): ");

        BiConsumer<List<Integer>, List<Integer>> implementMethodOrElseOptional
                = optionalLogic::implementMethodOrElseOptional;
        implementMethodOrElseOptional.accept(List.of(), List.of(1, 2, -5, 123));
        System.out.println("----------------------------------");

        System.out.println("Implement method orElseGet(): ");
        Consumer<List<Integer>> implementMethodOrElseGetOptional
                = optionalLogic::implementMethodOrElseGetOptional;
        implementMethodOrElseGetOptional.accept(List.of(-3, -14, 5));
        System.out.println("-----------------------------------");


        System.out.println("Implement method ifPresent():");
        Runnable implementMethodIfPresentOptional = optionalLogic::implementMethodIfPresentOptional;
        implementMethodIfPresentOptional.run();
        System.out.println("--------------------------------");


        System.out.println("Implement method ifPresentOrElse(): ");
        Runnable runnable = optionalLogic::implementMethodIfPresentOrElseOptional;
        runnable.run();
        System.out.println("_____________________________________");

        System.out.println("Implement method orElseThrow():");
        Consumer<List<Integer>> implementMethodOrElseThrow = optionalLogic::implementMethodOrElseThrow;
        implementMethodOrElseThrow.accept(List.of());
        System.out.println("---------------------------------");



    }
}
