package funcByMetanit.streamAPI.substreamAndMergingStreams;

import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class SubStreamAndMergingStreamsLogic {

    // takeWhile(Predicate<T> predicate) - выбирает элементы из потока, пока они соотвествуют условию
    public void implementMethodTakeWhile(List<Integer> numbers) {
        Predicate<Integer> integerPredicate = number -> number < 0;
        numbers.stream()
                .takeWhile(integerPredicate)
                .forEach(System.out::println);
    }

    // dropWhile(Predicate<T> predicate) - выполянет обратную задачу - он пропускает элемнеты потока, которые
    // соотвествуют условию до тех пор, пока не встретит элемент, который НЕ соотвествует услвоию
    public void implementMethodDropWhile(List<Integer> numbers) {
        Predicate<Integer> predicate = number -> number < 0;
        numbers.stream()
                .dropWhile(predicate)
                .forEach(System.out::println);
    }

    // concat(stream a, stream b) - объединяет элементы двух потоков, возврашая объединённый поток
    public Stream<Object> implementMethodConcatStreams(Stream<String> stream1, Stream<String> stream2) {
        return Stream.concat(stream1, stream2);
    }

    // distinct() - возвращает только уникальные элементы в виде потока
    public void implementMethodDistinct(List<String> names) {
        Consumer<String> consumer = System.out::print;
        names.stream()
                .distinct()
                .map(name -> String.format("%s ", name))
                .forEach(consumer);
    }

}
