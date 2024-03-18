package rocks.zipcode;

import org.junit.Test;
import org.junit.Assert;
import java.util.ArrayList;
import java.util.HashMap;

public class IteratorTest {
    @Test
    public void testHasNext(){
        ArrayList<Integer> arrayList = new ArrayList<>();

        arrayList.add(30);
        arrayList.add(45);

        Assert.assertTrue(arrayList.iterator().hasNext());

    }

    @Test
    public void testHasPrevious(){
        ArrayList<Integer> list = new ArrayList<Integer>();

        list.add(1);
        list.add(2);
        Assert.assertTrue(list.iterator().hasNext());
    }
}
