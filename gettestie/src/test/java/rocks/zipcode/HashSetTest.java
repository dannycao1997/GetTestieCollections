package rocks.zipcode;
import org.junit.Assert;
import org.junit.Test;
import java.util.HashSet;
import java.util.Set;


public class HashSetTest {

    @Test
    public void testAddAndRemove(){
        Set<String> hashset = new HashSet<>();

        // Adding Strings to hash set
        hashset.add("Danny");
        hashset.add("Cao");

        // Removing string from has set
        hashset.remove("Cao");

        //Verifying string "Danny" was added to hash set
        Assert.assertTrue(hashset.contains("Danny"));

        //Verifying string "Cao" was removed from hash set
        Assert.assertFalse(hashset.contains("Cao"));
    }

    @Test
    public void testAddAndRemove2(){
        Set<Integer> hashset = new HashSet<>();

        // Adding integer to hash set
        hashset.add(97);
        hashset.add(9);

        // Removing integer from hash set
        hashset.remove(97);

        // Verifying integer 9 was added to hash set
        Assert.assertTrue(hashset.contains(9));

        // Verifying integer 97 was removed from hash set
        Assert.assertFalse(hashset.contains(97));
    }
}


