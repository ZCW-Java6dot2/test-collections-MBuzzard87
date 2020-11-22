package rocks.zipcode;

import org.junit.Test;

import java.util.PriorityQueue;

import static org.junit.Assert.*;

public class TestPriorityQueue {

    @Test
    public void testPriorityQueueName() {
        PriorityQueue<String> names = new PriorityQueue<>();
        Person person1 = new Person("Buzz", 1987);
        Person person2 = new Person("Buzzworth", 1999);
        names.add(person1.getName());
        String expectedName1 = "Buzz";
        String expectedName2 = "Buzzworth";

        assertTrue(names.contains(expectedName1));
        assertFalse(names.contains(expectedName2));
    }


}
