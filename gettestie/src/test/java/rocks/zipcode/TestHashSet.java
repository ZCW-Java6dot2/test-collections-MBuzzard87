package rocks.zipcode;

import org.junit.Test;

import java.util.HashSet;

import static org.junit.Assert.*;

public class TestHashSet {

    @Test
    public void testHashSetEmpty() {
        HashSet<Person> people = new HashSet<>();
        assertTrue(people.isEmpty());
    }

    @Test
    public void testHashSetContains() {
        HashSet<Person> people = new HashSet<>();
        Person person1 = new Person("Buzz", 1987);
        Person person2 = new Person("Matt", 1989);
        people.add(person1);

        assertTrue(people.contains(person1));
        assertFalse(people.contains(person2));
    }

}
