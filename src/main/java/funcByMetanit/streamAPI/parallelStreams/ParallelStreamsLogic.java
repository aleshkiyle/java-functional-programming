package funcByMetanit.streamAPI.parallelStreams;

import java.util.List;

public class ParallelStreamsLogic {

    public Integer implementMethodParallelStream(List<Integer> numbers) {
        return numbers.parallelStream()
                .reduce((x, y) -> x * y)
                .orElse(-1);
    }
}
