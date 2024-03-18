package rocks.zipcode;

import org.junit.Assert;
import org.junit.Test;

import java.util.TreeMap;

public class TreeMapTest {
    @Test
    public void testAdd(){
        TreeMap<Integer, String> treemap = new TreeMap<>();

        treemap.put(1, "first");
        treemap.put(2, "second");

        Assert.assertTrue(treemap.containsValue("first"));
        Assert.assertTrue(treemap.containsValue("second"));
    }

    @Test
    public void testRemove(){
        TreeMap<Integer,String> treemap = new TreeMap<>();

        treemap.put(5, "five");
        treemap.put(10, "ten");

        treemap.remove(10, "ten");

        Assert.assertFalse(treemap.containsValue("ten"));
    }
}
