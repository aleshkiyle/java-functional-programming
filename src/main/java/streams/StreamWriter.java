package streams;

import entity.Gender;

import java.util.List;
import java.util.Set;

public class StreamWriter {

    public void printGenderPeoples(Set<Gender> genders) {
        for (Gender gender : genders) {
            System.out.println(gender);
        }
    }

    public void printLengthNamesPeoples(int[] lengthNamesPeoples) {
        for (int lengthNamesPeople : lengthNamesPeoples) {
            System.out.println("Length name: " + lengthNamesPeople);
        }
    }

    public void printAgePeoples(List<Integer> agePeoples) {
        for (Integer age : agePeoples) {
            System.out.println(age);
        }
    }

    public void printCheckFemalesInPersons(List<Boolean> listCheckFemales) {
        for (Boolean checkFemales : listCheckFemales) {
            System.out.println(checkFemales);
        }
    }

    public void printCheckNoneMatchStreamWithUndefinedGender(Boolean isUndefinedGender) {
        System.out.println("UNDEFINED is exist in list persons - " + isUndefinedGender);
    }
}
