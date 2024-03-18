package rocks.zipcode;
import org.junit.Assert;
import org.junit.Test;
import java.util.LinkedList;

public class LinkedListTest {

    @Test
    public void testAddAndGet() {
        LinkedList<String> list = new LinkedList<String>();

        list.add("ELEMENT ONE");

        Assert.assertEquals("ELEMENT ONE", list.get(0));
    }
    @Test
    public void testSize() {
        LinkedList<String> list = new LinkedList<String>();

        list.add("Hello");
        list.add("World");
        list.add("HAHA");

        Assert.assertEquals("Should have 3 strings in here", 3, list.size());
    }
}
