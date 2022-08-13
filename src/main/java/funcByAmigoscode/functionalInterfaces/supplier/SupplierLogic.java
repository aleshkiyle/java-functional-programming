package funcByAmigoscode.functionalInterfaces.supplier;

import java.util.List;
import java.util.function.Supplier;

public class SupplierLogic {

    public final String getDBConnectionURL() {
        return "jdbc://localhost:5432/users";
    }

    public final Supplier<List<String>> getConnectionsDB =
            () -> List.of("jdbc://localhost:5432/users",
                    "jdbc://localhost:5432/customers");

    public final Supplier<Integer> getRandomNumberBetweenZeroAndTen =
            () -> (int) (Math.random() * 10);
}
