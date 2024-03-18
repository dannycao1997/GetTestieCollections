package rocks.zipcode;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayDeque;

public class ArrayDequeTest {
    @Test
    public void testAdd() {
        ArrayDeque<Integer> arraydeque = new ArrayDeque<>();

        // added integer to first and last
        arraydeque.addFirst(1);
        arraydeque.addLast(2);

        //verify integer are added
        Assert.assertTrue(arraydeque.contains(1));
        Assert.assertEquals(2, 2);
    }
    @Test
    public void testSize(){
        ArrayDeque<String> arraydeque = new ArrayDeque<>();


        //Added 3 strings to the arraydeque
        arraydeque.add("ONE");
        arraydeque.add("TWO");
        arraydeque.add("THREE");

        //verify 3 strings are there
        Assert.assertEquals(3, arraydeque.size());
}
}

