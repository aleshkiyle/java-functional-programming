package funcByMetanit.streamAPI.sort.comparators;

import funcByMetanit.streamAPI.util.Phone;

import java.util.Comparator;

public class PhoneComparatorByName implements Comparator<Phone> {

    @Override
    public int compare(Phone phone1, Phone phone2) {
        return Integer.compare(phone1.getName().length(), phone2.getName().length());
    }
}
