package rocks.zipcode;
import org.junit.Assert;
import org.junit.Test;
import java.util.ArrayList;


// ArrayList<String> cars = new ArrayList<String>(); // Create an ArrayList object
// 


public class ArrayListTest {
    @Test
    public void testAddAndGet(){
        ArrayList<String> myList = new ArrayList<>();

        // Test adding new elements
        myList.add(0,"Zip");
        myList.add(1, "Code");

        // Verifying new elements are added
        Assert.assertEquals("Zip", myList.get(0));
        Assert.assertEquals("Code", myList.get(1));
    }
    @Test
    public void testRemove(){
        ArrayList<String> myList = new ArrayList<>();

        // Test adding elements to index 0
        myList.add(0,"HELLO WORLD");

        // Test remove element from index 0
        myList.remove("HELLO WORLD");

        // Verifying string is removed from index 0
        Assert.assertEquals(0, myList.size());
    }
}
