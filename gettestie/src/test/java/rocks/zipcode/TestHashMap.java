package rocks.zipcode;

import org.junit.Test;

import java.util.HashMap;

import static org.junit.Assert.*;

public class TestHashMap {

    @Test
    public void testHashMapNotEmpty() {
        HashMap<Person, String> hashMap1 = new HashMap<>();
        Person person1 = new Person("Buzz", 1987);
        String genderMale = "Male";

        hashMap1.put(person1,genderMale);

        assertFalse(hashMap1.isEmpty());
    }

    @Test
    public void testHashMapVal() {
        HashMap<Person, String> hashMap1 = new HashMap<>();
        Person person1 = new Person("Buzz", 1987);
        Person person2 = new Person("Betty", 1975);
        String genderMale = "Male";
        String genderFemale = "Female";

        hashMap1.put(person1,genderMale);
        hashMap1.put(person2,genderFemale);

        String expectedValue1 = "Male";
        String expectedValue2 = "Female";

        assertEquals(expectedValue1, hashMap1.get(person1));
        assertEquals(expectedValue2, hashMap1.get(person2));
    }

    @Test
    public void testHashMapContains() {
        HashMap<Person, String> hashMap1 = new HashMap<>();
        Person person1 = new Person("Buzz", 1987);

        String genderMale = "Male";

        hashMap1.put(person1,genderMale);

        Person expectedKey1 = person1;

        assertTrue(hashMap1.containsKey(person1));

    }
}
