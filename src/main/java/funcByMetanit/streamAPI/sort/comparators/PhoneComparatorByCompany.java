package funcByMetanit.streamAPI.sort.comparators;

import funcByMetanit.streamAPI.sort.data.Phone;

import java.util.Comparator;
import java.util.Locale;

public class PhoneComparatorByCompany implements Comparator<Phone> {

    @Override
    public int compare(Phone phone1, Phone phone2) {
        return phone1.getCompany().toUpperCase(Locale.ROOT).compareTo(phone2.getCompany().toUpperCase(Locale.ROOT));
    }
}
