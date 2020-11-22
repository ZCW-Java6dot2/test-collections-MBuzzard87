package rocks.zipcode;

import org.junit.Test;

import java.util.TreeMap;

import static org.junit.Assert.assertEquals;

public class TestTreeMap {

    @Test
    public void testTreeMapValue() {
        TreeMap<Integer, String> treeJawn = new TreeMap<>();
        treeJawn.put(100,"Hello");
        treeJawn.put(20, "Hi");
        treeJawn.put(50, "World");
        treeJawn.put(100, "World");

        assertEquals("World", treeJawn.get(100));
    }
}
