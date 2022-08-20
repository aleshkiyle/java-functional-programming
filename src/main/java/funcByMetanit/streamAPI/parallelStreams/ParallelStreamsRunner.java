package funcByMetanit.streamAPI.parallelStreams;

import java.util.List;
import java.util.function.Function;

public class ParallelStreamsRunner {

    public static void main(String[] args) {
        ParallelStreamsLogic parallelStreamsLogic = new ParallelStreamsLogic();
        Function<List<Integer>, Integer> function = parallelStreamsLogic::implementMethodParallelStream;
        System.out.println(function.apply(List.of(1, -5, 3)));

    }
}
