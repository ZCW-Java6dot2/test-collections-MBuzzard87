package rocks.zipcode;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayDeque;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

public class TestArrayDeque {

    @Test
    public void testArrDequeNotEmpty() {
        ArrayDeque<Person> people = new ArrayDeque<>();
        Person person1 = new Person("Buzz",1987);

        people.add(person1);


        assertFalse(people.isEmpty());
    }

    @Test
    public void testArrDequePeek() {
        ArrayDeque<Person> people = new ArrayDeque<>();
        Person person1 = new Person("Buzz",1987);
        Person person2 = new Person("Mike",1929);
        Person person3 = new Person("Betty",1960);

        people.add(person1);
        people.add(person2);
        people.add(person3);

        Person expectedFirst = person1;
        Person expectedLast = person3;
        Person actualFirst = people.peekFirst();
        Person actualLast = people.peekLast();

        assertEquals(expectedFirst,actualFirst);
        assertEquals(expectedLast,actualLast);
    }

    @Test
    public void testArrDequeGet() {
        ArrayDeque<Person> people = new ArrayDeque<>();
        Person person1 = new Person("Buzz",1987);
        Person person2 = new Person("Mike",1929);
        Person person3 = new Person("Betty",1960);

        people.add(person1);
        people.add(person2);
        people.add(person3);

        Person expectedFirst = person1;
        Person expectedLast = person3;
        Person actualFirst = people.getFirst();
        Person actualLast = people.getLast();

        assertEquals(expectedFirst,actualFirst);
        assertEquals(expectedLast,actualLast);
    }


}
