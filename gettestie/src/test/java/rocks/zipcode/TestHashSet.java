package rocks.zipcode;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class TestHashSet {

    @Test
    public void hashSetConstructorFromColSizeTest(){
        List<Person> aL = new ArrayList<>();
        Person p1 = new Person("John Doe",1111);
        Person p2 = new Person("Jawn D'oh",1222);
        Person p3 = new Person("Jane Dai",1333);
        aL.add(p1);
        aL.add(p2);
        aL.add(p3);
        Set<Person> hS = new HashSet<>(aL);
        int actual = hS.size();
        int expected = 3;
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void hashSetConstructorFromColContainsTest(){
        List<Person> aL = new ArrayList<>();
        Person p1 = new Person("John Doe",1111);
        Person p2 = new Person("Jawn D'oh",1222);
        Person p3 = new Person("Jane Dai",1333);
        aL.add(p1);
        aL.add(p2);
        aL.add(p3);
        Set<Person> hS = new HashSet<>(aL);
        Boolean containsAll = true;
        for(Person p:aL) if(!hS.contains(p))containsAll=false;
        Assert.assertTrue(containsAll);
    }


    @Test
    public void hashSetNotInsertionOrderTest(){
        List<Person> aL = new ArrayList<>();
        aL.clear();
        Person p1 = new Person("John Doe",1111);
        Person p2 = new Person("Jawn D'oh",1222);
        Person p3 = new Person("Jane Dai",1333);
        Person p4 = new Person("Janet Du",1444);
        aL.add(p1);
        aL.add(p2);
        aL.add(p3);
        aL.add(p4);
        Set<Person> hS = new HashSet<>();
        hS.clear();
        hS = new HashSet<>(aL);
        String unexpected = aL.toString();
        String actual = hS.toString();
        Assert.assertNotEquals(unexpected,actual);
    }

    @Test
    public void hashSetDuplicateRejectedConstruction(){
        List<Person> aL = new ArrayList<>();
        aL.clear();
        Person p1 = new Person("John Doe",1111);
        Person p2 = new Person("Jawn D'oh",1222);
        Person p3 = new Person("Jane Dai",1333);
        aL.add(p1);
        aL.add(p2);
        aL.add(p3);
        aL.add(p1);
        Set<Person> hS = new HashSet<>(aL);
        int expected = 3;
        int actual = hS.size();
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void hashSetDuplicateRejectedInsert(){
        List<Person> aL = new ArrayList<>();
        aL.clear();
        Person p1 = new Person("John Doe",1111);
        Person p2 = new Person("Jawn D'oh",1222);
        Person p3 = new Person("Jane Dai",1333);
        aL.add(p1);
        aL.add(p2);
        aL.add(p3);
        Set<Person> hS = new HashSet<>(aL);
        hS.add(p1);
        int expected = 3;
        int actual = hS.size();
        Assert.assertEquals(expected,actual);
    }
}
