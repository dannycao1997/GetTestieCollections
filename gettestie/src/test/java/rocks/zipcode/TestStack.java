package rocks.zipcode;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;
import java.util.Stack;

public class TestStack {

    @org.junit.Before
    public void setUp() throws Exception {
    }

    @org.junit.After
    public void tearDown() throws Exception {
    }

    @org.junit.Test
    public void TestStack1() {
        Stack<String> stack = new Stack<>();
        stack.push("Hello world");
        assertEquals(false, stack.isEmpty()); // false
    }

    // Make a bigger test exercising more Stack methods.....

    @Test
    public void testPop(){
        Stack<String> stack = new Stack<>();
        // add string on top of stack
        stack.push("YOOOOO");
        // remove string on top of stack
        stack.pop();
        // confirms true stack is now empty
        assertEquals(true, stack.isEmpty());
    }

    @Test
    public void testPeek(){
        Stack<String> stack = new Stack<>();

        // added strings 4 strings on top of stack
        stack.push("first");
        stack.push("second");
        stack.push("third");
        stack.push("fourth");
        // top of the stack should be string "fourth"
        assertEquals("fourth", stack.peek());

    }

    @Test
    public void testIsEmpty() {
        Stack<Integer> stack = new Stack<>();

        //added 3 integers into stack
        stack.push(20000);
        stack.push(1231231);
        stack.push(3131231);

        //removed all 3 integers in stack
        stack.pop();
        stack.pop();
        stack.pop();

        //confirms integers are no longer in stack / is empty
        assertEquals(true, stack.isEmpty());
    }
}
