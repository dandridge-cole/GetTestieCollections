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

    @Test
    public void testPush(){
        Stack<String> stack = new Stack<>();
        stack.push("a");
        stack.push("b");
        stack.push("c");
        String actual = stack.toString();
        String expected = "[a, b, c]";
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void testPop(){
        Stack<String> stack = new Stack<>();
        stack.push("a");
        stack.push("b");
        stack.push("c");
        String actual = stack.pop().toString();
        actual+=stack.pop();
        actual+=stack.pop();
        String expected = "cba";
        Assert.assertEquals(expected,actual);

    }

    @Test
    public void testEmpty() {
        Stack<String> stack = new Stack<>();
        stack.push("a");
        stack.push("b");
        stack.push("c");
        stack.pop();
        stack.pop();
        stack.pop();
        Assert.assertTrue(stack.empty());
    }

    @Test
    public void testPeek() {
        Stack<String > stack = new Stack<>();
        String expected = "a";
        stack.push(expected);
        stack.push("b");
        stack.push("c");
        stack.pop();
        stack.pop();
        String actual = stack.peek();
        Assert.assertEquals(expected,actual);
        Assert.assertEquals(1,stack.size());
    }

    // Make a bigger test exercising more Stack methods.....
}
