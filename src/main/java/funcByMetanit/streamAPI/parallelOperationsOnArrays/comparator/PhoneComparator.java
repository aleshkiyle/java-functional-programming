package funcByMetanit.streamAPI.parallelOperationsOnArrays.comparator;

import funcByMetanit.streamAPI.parallelOperationsOnArrays.data.Phone;

import java.util.Comparator;
import java.util.Locale;

public class PhoneComparator implements Comparator<Phone> {

    @Override
    public int compare(Phone o1, Phone o2) {
        return o2.getName().toUpperCase(Locale.ROOT)
                .compareTo(o2.getName().toUpperCase(Locale.ROOT));
    }
}
