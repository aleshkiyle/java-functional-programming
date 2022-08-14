package funcByMetanit.streamAPI.sort.comparators;

import funcByMetanit.streamAPI.util.Phone;

import java.util.Comparator;

public class PhoneComparatorByPrice implements Comparator<Phone> {

    @Override
    public int compare(Phone phone1, Phone phone2) {
        return Integer.compare(phone1.getPrice(), phone2.getPrice());
    }
}
