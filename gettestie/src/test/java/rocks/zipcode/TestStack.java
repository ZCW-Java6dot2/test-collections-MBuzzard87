package rocks.zipcode;

import org.junit.Test;

import static org.junit.Assert.*;
import java.util.Stack;

public class TestStack {

    @org.junit.Before
    public void setUp() throws Exception {
    }

    @org.junit.After
    public void tearDown() throws Exception {
    }

    @org.junit.Test
    public void TestStack1() {
        Stack<String> stack = new Stack<>();
        stack.push("Hello world");
        assertEquals(false, stack.isEmpty()); // false
    }


    @Test
    public void testStack2() {
        Stack<Person> people = new Stack<>();
        Person person1 = new Person("Mike", 1987);
        Person person2 = new Person("Ash", 1996);
        people.push(person2);
        people.push(person1);
        Person expectedPerson = person1;

        assertEquals(expectedPerson, people.peek());
    }


    // Make a bigger test exercising more Stack methods.....
}
