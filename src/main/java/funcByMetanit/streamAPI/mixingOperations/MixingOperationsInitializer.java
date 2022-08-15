package funcByMetanit.streamAPI.mixingOperations;

import funcByMetanit.streamAPI.mixingOperations.util.Phone;

import java.util.List;

public class MixingOperationsInitializer {

    private final List<String> names;
    private final List<Integer> numbers;
    private final List<Phone> phones;


    public MixingOperationsInitializer() {
        this.names = initNames();
        this.numbers = initNumbers();
        this.phones = initPhones();
    }

    private List<String> initNames() {
        return List.of(
                "Alexey", "Bob", "Alice", "Artur", "Ivan", "Tom"
        );
    }

    private List<Integer> initNumbers() {
        return List.of(
                1, 2, 3, 4, 5, 6, 7, 8, 9
        );
    }

    private List<Phone> initPhones() {
        return List.of(
                new Phone("Iphone 8 plus", 34999.99),
                new Phone("Iphone 12 pro max", 66999.99),
                new Phone("Meizu 33 pro zet", 55999.99)
        );
    }

    public List<String> getNames() {
        return names;
    }

    public List<Integer> getNumbers() {
        return numbers;
    }

    public List<Phone> getPhones() {
        return phones;
    }
}
