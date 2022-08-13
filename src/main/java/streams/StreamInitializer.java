package streams;

import entity.Person;

import java.util.Collections;
import java.util.List;

import static entity.Gender.*;

public class StreamInitializer {

    private List<Person> persons;

    public StreamInitializer(List<Person> persons) {
        this.persons = persons;
        initializePersons(persons);
    }

    public List<Person> getPersons() {
        return this.persons;
    }

    public void setPersons(List<Person> persons) {
        this.persons = persons;
    }

    public void initializePersons(List<Person> persons) {
        Collections.addAll(persons,
                new Person("Nasty", 21, FEMALE),
                new Person("Dmitriy", 19, MALE),
                new Person("Alisa", 15, FEMALE),
                new Person("Ivan", 20, MALE),
                new Person("Petrovich", 34, MALE),
                new Person("Elizaveta", 25, FEMALE),
                new Person("Artur", 22, MALE),
                new Person("Andrew", 23, MALE),
                new Person("Alexey", 20, MALE),
                new Person("Bob", 25, PREFER_NOT_TO_STAY),
                new Person("Anantoliy", 10, UNDEFINED)
        );
    }
}
