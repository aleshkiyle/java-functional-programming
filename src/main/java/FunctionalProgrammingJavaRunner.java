import entity.Gender;
import entity.Person;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.function.Predicate;

public class FunctionalProgrammingJavaRunner {

    public static void main(String[] args) {
        List<Person> persons = new ArrayList<>();
        initializePersons(persons);
        System.out.println("List persons: ");
        System.out.println(persons);
        System.out.println("List females in person: ");
        System.out.println(findFemalesUsingImperativeApproach(persons));
        System.out.println("List males in persons: ");
        System.out.println(findMalesUsingFunctionalApproach(persons));
    }

    public static void initializePersons(List<Person> persons) {
        Collections.addAll(persons,
                new Person("Nasty", 21, Gender.FEMALE),
                new Person("Dmitriy", 19, Gender.MALE),
                new Person("Alisa", 15, Gender.FEMALE),
                new Person("Ivan", 20, Gender.MALE),
                new Person("Petrovich", 34, Gender.MALE),
                new Person("Elizaveta", 25, Gender.FEMALE),
                new Person("Artur", 22, Gender.MALE),
                new Person("Andrew", 23, Gender.MALE),
                new Person("Alexey", 20, Gender.MALE)
        );
    }

    private static List<Person> findFemalesUsingImperativeApproach(List<Person> persons) {
        List<Person> females = new ArrayList<>();
        for (Person female: persons) {
            if (female.gender().equals(Gender.FEMALE)) {
                females.add(female);
            }
        }
        return females;
    }

    private static List<Person> findMalesUsingFunctionalApproach(List<Person> persons) {
        Predicate<Person> personPredicate = person -> person.gender().equals(Gender.MALE);
        System.out.println(personPredicate.test(new Person("Alex", 20, Gender.FEMALE)));
        return persons.stream()
                .filter(personPredicate)
                .toList();
    }

}
