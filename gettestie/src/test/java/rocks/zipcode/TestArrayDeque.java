package rocks.zipcode;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayDeque;

public class TestArrayDeque {

    @Test
    public void addTest(){
        ArrayDeque<Address> arrayDeque = new ArrayDeque<>();
        Address expectedLast = new Address(null,null,null);
        Address expectedFirst = new Address(null,null,null);
        arrayDeque.addLast(expectedLast);
        arrayDeque.addFirst(expectedFirst);
        Address actualFirst = arrayDeque.getFirst();
        Address actualLast = arrayDeque.getLast();

        Assert.assertEquals(expectedFirst,actualFirst);
        Assert.assertEquals(expectedLast,actualLast);
    }

    @Test
    public void removeAndPeekTest(){
        ArrayDeque<Address> arrayDeque = new ArrayDeque<>();
        Address initialLast = new Address(null,null,null);
        Address initialFirst = new Address(null,null,null);
        arrayDeque.addLast(initialLast);
        arrayDeque.addFirst(initialFirst);
        int size1 = arrayDeque.size();
        Address actualRemoveFirst=arrayDeque.removeFirst();
        Address actual = arrayDeque.peekFirst();
        int size2 = arrayDeque.size();
        Address actualRemoveLast = arrayDeque.removeLast();
        int size3=arrayDeque.size();

        Assert.assertEquals(initialLast,actual);
        Assert.assertEquals(initialLast,actualRemoveLast);
        Assert.assertEquals(initialFirst,actualRemoveFirst);
        Assert.assertEquals(2,size1);
        Assert.assertEquals(1,size2);
        Assert.assertEquals(0,size3);
    }

    @Test
    public void pushPopClearTest() {
        ArrayDeque<Address> arrayDeque = new ArrayDeque<>();
        Address initialLast = new Address(null, null, null);
        Address initialFirst = new Address(null, null, null);
        arrayDeque.push(initialFirst);
        arrayDeque.push(initialLast);
        Address actualLast=arrayDeque.pop();
        arrayDeque.push(actualLast);
        int size1 = arrayDeque.size();
        arrayDeque.clear();
        int size2 = arrayDeque.size();

        Assert.assertEquals(initialLast,actualLast);
        Assert.assertEquals(2,size1);
        Assert.assertEquals(0,size2);
    }
}
