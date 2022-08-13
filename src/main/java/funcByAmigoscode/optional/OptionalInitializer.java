package funcByAmigoscode.optional;

import java.util.List;

public class OptionalInitializer {

    private List<Integer> numbers;

    public List<Integer> getNumbers() {
        return numbers;
    }

    public OptionalInitializer(List<Integer> numbers) {
        this.numbers = numbers;
        initList();
    }

    private List<Integer> initList() {
        this.numbers = List.of(1, -5, 3, 12, -24);
        return this.numbers;
    }
}
