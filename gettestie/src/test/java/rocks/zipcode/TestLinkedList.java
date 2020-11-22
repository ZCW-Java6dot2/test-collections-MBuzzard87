package rocks.zipcode;

import org.junit.Test;

import java.util.LinkedList;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class TestLinkedList {

    @Test
    public void testLinkedListNotEmpty() {
        LinkedList<Person> people = new LinkedList<>();
        Person person1 = new Person("Mike", 1987);
        people.add(person1);

        assertFalse(people.isEmpty());
    }

    @Test
    public void testLikedListContains() {
        LinkedList<Person> people = new LinkedList<>();
        Person person1 = new Person("Buzz", 1987);
        Person person2 = new Person("Buzzworth", 1999);
        people.add(person1);
        people.add(person2);

        Boolean containsPerson = people.contains(person2);

        assertTrue(containsPerson);
    }
}
