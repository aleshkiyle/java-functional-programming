package streams;

import entity.Gender;
import entity.Person;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class StreamRunner {

    public static void main(String[] args) {
        StreamInitializer init = new StreamInitializer(new ArrayList<>());
        List<Person> persons = init.getPersons();

        StreamLogic streamLogic = new StreamLogic();
        Set<Gender> genders = streamLogic.findGenderPersons(persons);
        int[] namesLength = streamLogic.findLengthNamesPeoples(persons);
        List<Integer> age = streamLogic.findAgesPeoples(persons);
        List<Boolean> checkFemalesInListPeoplesFemales = streamLogic.checkFemalesInListPeoples(persons);
        Boolean isCheckUndefinedGender = streamLogic.checkNoneGenderInPersons(persons);

        StreamWriter writer = new StreamWriter();
        writer.printGenderPeoples(genders);
        writer.printLengthNamesPeoples(namesLength);
        writer.printAgePeoples(age);
        writer.printCheckFemalesInPersons(checkFemalesInListPeoplesFemales);
        writer.printCheckNoneMatchStreamWithUndefinedGender(isCheckUndefinedGender);
    }
}
