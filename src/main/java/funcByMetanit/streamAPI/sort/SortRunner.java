package funcByMetanit.streamAPI.sort;

import funcByMetanit.streamAPI.util.Phone;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortRunner {

    public static void main(String[] args) {
        List<Phone> phones = List.of(
                new Phone("Iphone X", 50000),
                new Phone("Nokia 9", 12000),
                new Phone("Huawei Nexus 6P", 33000),
                new Phone("Samsung Galaxy S8", 66000),
                new Phone("LG G6", 28000),
                new Phone("Xiaomi MI6", 45000),
                new Phone("Asus Zenfone 3", 15000),
                new Phone("Sony Xperia Z5", 56000),
                new Phone("Meizu Pro 6", 35300),
                new Phone("Pixel 2", 77000)
        );
        List<funcByMetanit.streamAPI.sort.data.Phone> phoneList = new ArrayList<>();
        Collections.addAll(phoneList,
                new funcByMetanit.streamAPI.sort.data.Phone("Iphone X", "Apple", 600),
                new funcByMetanit.streamAPI.sort.data.Phone("Pixel 2", "Google", 500),
                new funcByMetanit.streamAPI.sort.data.Phone("Iphone 8", "Apple", 800),
                new funcByMetanit.streamAPI.sort.data.Phone("Nokia 9", "HMD Global", 150),
                new funcByMetanit.streamAPI.sort.data.Phone("Galaxy S 9", "Samsung", 300)
        );
        SortLogic sortLogic = new SortLogic();

        System.out.println("Implement sorted method in phones:");
        sortLogic.getImplementSortPhonesByPhoneComparatorByPrice(phones);
        System.out.println("--------------------");

        System.out.println("Implement sorted method in phones using phone comparator:");
        sortLogic.implementSortPhonesByPhoneComparator(phoneList);
        System.out.println("-----------------");
    }
}
