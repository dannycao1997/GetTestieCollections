package rocks.zipcode;
import org.junit.Assert;
import org.junit.Test;
import java.util.ArrayList;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class ComparableTest {

    @Test
    public void testCompare() {
        ArrayList<Integer> list = new ArrayList<Integer>();

        list.add(0,30);
        list.add(1,25);

        assertTrue(list.contains(30));
    }

    @Test
    public void testCompare2() {
        ArrayList<Integer> list = new ArrayList<Integer>();

        list.add(0,30);
        list.add(1,25);

        list.remove(1);

        assertFalse(list.contains(25));
    }

}
