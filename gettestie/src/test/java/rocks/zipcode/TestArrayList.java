package rocks.zipcode;

import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class TestArrayList {

    @Test
    public void testArrListEmpty() {
        ArrayList<Person> people = new ArrayList<>();

        assertTrue(people.isEmpty());
    }

    @Test
    public void testArrListGet() {
        ArrayList<Person> people = new ArrayList<>();
        Person person1 = new Person("Buzz", 1987);
        people.add(person1);

        Person expectedPerson = person1;
        Person actualPerson = people.get(0);

        assertEquals(expectedPerson,actualPerson);
    }

    @Test
    public void testArrListContains() {
        ArrayList<Person> people = new ArrayList<>();
        Person person1 = new Person("Buzz", 1987);
        Person person2 = new Person("Buzzworth", 1999);
        people.add(person1);
        people.add(person2);

        Boolean containsPerson = people.contains(person2);

        assertTrue(containsPerson);
    }


}
