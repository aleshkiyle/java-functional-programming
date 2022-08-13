package streams;

import entity.Gender;
import entity.Person;

import java.util.List;
import java.util.Set;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import static entity.Gender.FEMALE;

public class StreamLogic {

    public Set<Gender> findGenderPersons(List<Person> people) {
        return people.stream()
                .map(Person::gender)
                .collect(Collectors.toSet());
    }

    public int[] findLengthNamesPeoples(List<Person> people) {

        IntStream streamLengthNames = people.stream()
                .map(Person::name)
                .mapToInt(String::length);

        return streamLengthNames.toArray();
    }

    public List<Integer> findAgesPeoples(List<Person> people) {
        Stream<Integer> streamAgePersons = people.stream()
                .map(Person::age);

        return streamAgePersons.toList();
    }

    public List<Boolean> checkFemalesInListPeoples(List<Person> people) {
        Predicate<Person> personPredicate = person -> person.gender().equals(FEMALE);

        boolean containsOnlyFemales = people.stream()
                .allMatch(personPredicate);

        boolean containsAtLeastFemales = people.stream()
                .anyMatch(personPredicate);

        return List.of(containsOnlyFemales, containsAtLeastFemales);
    }

    public Boolean checkNoneGenderInPersons(List<Person> persons) {
        Predicate<Person> personPredicateWithGenderUndefined = person -> person.gender().equals(Gender.UNDEFINED);

        return persons.stream()
                .noneMatch(personPredicateWithGenderUndefined);
    }
}
