package rocks.zipcode;
import org.junit.Assert;
import org.junit.Test;
import java.util.Vector;

public class VectorTest {

    @Test
    public void testAdd(){
        Vector<String> vector = new Vector<String>();

        vector.add("string");

        Assert.assertTrue(vector.contains("string"));
    }



    @Test
    public void testRemove(){
        Vector<Integer> vector = new Vector<Integer>();

        vector.add(0, 1997);

        vector.remove(0);

        Assert.assertTrue(vector.isEmpty());
    }
}

