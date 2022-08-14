package funcByMetanit.streamAPI.sort;

import funcByMetanit.streamAPI.sort.comparators.PhoneComparatorByCompany;
import funcByMetanit.streamAPI.sort.comparators.PhoneComparatorByPrice;
import funcByMetanit.streamAPI.util.Phone;

import java.util.List;
import java.util.function.Predicate;

public class SortLogic {


    public void getImplementSortPhonesByPhoneComparatorByPrice(List<Phone> phones) {
        Predicate<Phone> phonePredicate = phone -> phone.getName().length() < 12;
        phones.stream()
                .filter(phonePredicate)
                .sorted(new PhoneComparatorByPrice())
                .forEach(System.out::println);
    }

    public void implementSortPhonesByPhoneComparator(List<funcByMetanit.streamAPI.sort.data.Phone> phones) {
        phones.stream()
                .sorted(new PhoneComparatorByCompany())
                .map(phone -> String.format("%s (%s): %d", phone.getName(), phone.getCompany(), phone.getPrice()))
                .forEach(System.out::println);
    }
}


