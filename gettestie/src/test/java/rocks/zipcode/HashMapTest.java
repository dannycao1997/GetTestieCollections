package rocks.zipcode;
import org.junit.Assert;
import org.junit.Test;
import java.util.HashMap;

public class HashMapTest {

    @Test
    public void testPutAndGet(){ // add and remove

        HashMap<Integer, String> hashmap = new HashMap<>();

        //Adding value to hashmap using put
        hashmap.put(1, "PUT ME IN THE MAP");
        hashmap.put(2, "IN AND OUT THE MAP");

        //Remove integer 2 and string "in and out the map" from hashmap
        hashmap.get(2);

        //verifying hashmaps has "put me in the hashmap"
        Assert.assertTrue(hashmap.containsValue("PUT ME IN THE MAP"));

        // verifying integer and string removed from hashmap
        Assert.assertFalse(hashmap.containsValue(2));
    }

    @Test
    public void testClear(){

        HashMap<Integer, Integer> hashmap = new HashMap<>();

        //Added Integers to hashmap
        hashmap.put(19,97);

        //Cleared out hashmap
        hashmap.clear();


        // check to see if hashmap is empty
        Assert.assertTrue(hashmap.isEmpty());

    }

}
