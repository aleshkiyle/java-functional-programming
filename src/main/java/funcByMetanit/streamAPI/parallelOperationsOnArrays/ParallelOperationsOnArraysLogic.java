package funcByMetanit.streamAPI.parallelOperationsOnArrays;

import funcByMetanit.streamAPI.parallelOperationsOnArrays.comparator.PhoneComparator;
import funcByMetanit.streamAPI.parallelOperationsOnArrays.data.Phone;

import java.util.Arrays;

public class ParallelOperationsOnArraysLogic {

    public int[] initializeArray(int size) {
        int[] values = new int[size];
        Arrays.parallelSetAll(values, i -> i * 10);
        return values;
    }
    
    public void getPhonesWithDiscount(Phone[] phones){
        Arrays.parallelSetAll(phones, i -> {
            phones[i].setPrice(phones[i].getPrice() - 10000);
            return phones[i];
        });

        Arrays.stream(phones)
                .forEach(phone -> System.out.printf("%s - %d \n", phone.getName(), phone.getPrice()));

    }

    public void implementParallelSort(int[] nums) {
        Arrays.parallelSort(nums);
    }

    public void implementSortPhoneWithPhoneComparator(Phone[] phones) {
        Arrays.parallelSort(phones, new PhoneComparator());
    }

    public void implementParallelPrefixMethod(int[] nums) {
        Arrays.parallelPrefix(nums, (x, y) -> x * y);
        for (int num: nums) {
            System.out.println(num);
        }
    }
}
