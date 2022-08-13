package funcByAmigoscode.finalsection;

import java.util.Locale;
import java.util.function.BiFunction;

public class LambdasService {

    public BiFunction<String, Integer, String> upperCaseName =
            (name, age) -> {
                if (name.isBlank()) throw new IllegalArgumentException("arg not exist");
                System.out.println(age);
                return name.toUpperCase(Locale.ROOT);
            };
}
