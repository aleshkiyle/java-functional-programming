package funcByMetanit.streamAPI.util;

public class Phone {

    private String name;
    private int price;

    public Phone(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return this.price;
    }

    public void setPrice(int price) {
        this.price = Math.max(price, 0);
    }

    @Override
    public String toString() {
        return "[Phone: " + "name: " + name + ", price: " + price + " ];";
    }
}
