package funcByMetanit.streamAPI.reduce;

import funcByMetanit.streamAPI.reduce.data.Phone;

import java.util.List;
import java.util.Optional;

public class ReduceLogic {

    public Optional<Integer> implementMethodReduceStreamAPI(List<Integer> numbers) {
        return numbers.stream()
                .reduce((number1, number2) -> number1 * number2);
    }

    public Optional<String> implementMethodReduceStreamAPIWithWords(List<String> words) {
        return words.stream()
                .reduce((word1, word2) -> word1 + " " + word2);
    }

    public int implementSumPricePhones(List<Phone> phones) {
        return phones.stream()
                .reduce(0,
                        (x, y) -> {
                            if (y.price() < 50000)
                                return x + y.price();
                            else
                                return x;
                        },
                        Integer::sum);
    }
}
