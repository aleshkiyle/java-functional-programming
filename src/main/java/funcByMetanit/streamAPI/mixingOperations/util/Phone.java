package funcByMetanit.streamAPI.mixingOperations.util;

public record Phone(String name, double price) {

    public static int compare(Phone phone1, Phone phone2) {
        return phone1.price() > phone2.price() ? 1 : -1;
    }
}
