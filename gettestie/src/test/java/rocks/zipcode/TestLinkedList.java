package rocks.zipcode;

import org.junit.Assert;
import org.junit.Test;

import java.util.*;

public class TestLinkedList {

    @Test
    public void LinkedListConstructorFromColSizeTest(){
        List<Person> aL = new ArrayList<>();
        Person p1 = new Person("John Doe",1111);
        Person p2 = new Person("Jawn D'oh",1222);
        Person p3 = new Person("Jane Dai",1333);
        aL.add(p1);
        aL.add(p2);
        aL.add(p3);
        List<Person> lL = new LinkedList<>(aL);
        int actual = lL.size();
        int expected = 3;
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void linkedListConstructorFromColContainsTest(){
        List<Person> aL = new ArrayList<>();
        Person p1 = new Person("John Doe",1111);
        Person p2 = new Person("Jawn D'oh",1222);
        Person p3 = new Person("Jane Dai",1333);
        aL.add(p1);
        aL.add(p2);
        aL.add(p3);
        List<Person> lL = new LinkedList<>(aL);
        Boolean containsAll = true;
        for(Person p:aL) if(!lL.contains(p))containsAll=false;
        Assert.assertTrue(containsAll);
    }


    @Test
    public void linkedLstInsertionOrderTest(){
        List<Person> aL = new ArrayList<>();
        aL.clear();
        Person p1 = new Person("One",1111);
        Person p2 = new Person("Two",1222);
        Person p3 = new Person("Three",1333);
        Person p4 = new Person("Four",1444);
        aL.add(p1);
        aL.add(p2);
        aL.add(p3);
        aL.add(p4);
        List<Person> lL = new LinkedList<>(aL);
        String expected = aL.toString();
        String actual = lL.toString();
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void linkedLst(){
        List<Person> aL = new ArrayList<>();
        aL.clear();
        List<Person> aL2 = new ArrayList<>();
        aL2.clear();
        Person p0 = new Person("Zero",1000);
        Person p1 = new Person("One",1111);
        Person p2 = new Person("Two",1222);
        Person p3 = new Person("Three",1333);
        Person p4 = new Person("Four",1444);
        aL.add(p0);
        aL.add(p2);
        aL.add(p3);
        aL.add(p4);
        aL2.add(p0);
        aL2.add(p1);
        aL2.add(p2);
        aL2.add(p3);
        aL2.add(p4);
        List<Person> lL = new LinkedList<>(aL);
        String expected = aL2.toString();
        lL.add(1, p1);
        String actual = lL.toString();
        Assert.assertEquals(expected,actual);
    }


}
