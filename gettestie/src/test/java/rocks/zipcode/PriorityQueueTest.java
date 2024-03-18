package rocks.zipcode;
import org.junit.Assert;
import org.junit.Test;

import java.util.Objects;
import java.util.PriorityQueue;

public class PriorityQueueTest {
    @Test
    public void testAdd(){
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        pq.add(1);
        pq.add(2);
        pq.add(3);
        pq.add(4);

        Assert.assertTrue(pq.contains(3));
    }

    @Test
    public void testRemove(){

        PriorityQueue<String> pq = new PriorityQueue<>();

        pq.add("one");
        pq.add("two");
        pq.add("three");

        pq.remove();

        Assert.assertFalse(pq.contains("one"));
        }
    }
