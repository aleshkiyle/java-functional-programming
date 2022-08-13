package funcByAmigoscode.functionalInterfaces.supplier;

// Supplier<T> represents a supplier results
// Ничего не принимает на вход, но возвращает объекта типа <T>
public class _Supplier {

    public static void main(String[] args) {
        SupplierLogic supplierLogic = new SupplierLogic();
        System.out.println("Normal java function: ");
        System.out.println(supplierLogic.getDBConnectionURL());
        System.out.println("Supplier functional interface:");
        System.out.println(supplierLogic.getConnectionsDB.get());
        System.out.println("Random number between 0 and 10: " + supplierLogic.getRandomNumberBetweenZeroAndTen.get());
    }
}
