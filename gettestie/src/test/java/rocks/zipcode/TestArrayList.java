package rocks.zipcode;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

public class TestArrayList {

    @Test
    public void listAddTest(){
        Person expected = new Person("George Washinton",1732);
        ArrayList<Person> arrList = new ArrayList<Person>();
        int before = arrList.size();
        arrList.add(expected);
        int after = arrList.size();
        Person actual=arrList.get(0);
        Assert.assertEquals(expected,actual);
        Assert.assertEquals(before+1,after);
    }

    @Test
    public void listRemoveTest(){
        Person unexpected = new Person("George Washinton",1732);
        ArrayList<Person> arrList = new ArrayList<Person>();
        arrList.add(unexpected);
        int before = arrList.size();
        arrList.remove(0);
        int after = arrList.size();
        Assert.assertFalse(arrList.contains(unexpected));
        Assert.assertEquals(before,after+1);
    }

    public void addAllTestTrue(){
        Person p1 = new Person(null,0);
        Person p2 = new Person(null,0);
        Person p3 = new Person(null,0);
        Person p4 = new Person(null,0);
        ArrayList<Person> aL1 = new ArrayList<>();
        ArrayList<Person> aL2 = new ArrayList<>();
        aL1.add(p1);
        aL1.add(p2);
        aL1.add(p3);
        aL2.add(p1);
        aL2.add(p2);
        aL2.add(p4);
        Boolean b = aL1.addAll(aL2);
        int actual=aL1.size();
        int expected=4;
        Assert.assertTrue(b);
        Assert.assertEquals(expected,actual);
    }
    @Test
    public void addAllTestFalse(){
        Person p1 = new Person(null,0);
        Person p2 = new Person(null,0);
        Person p3 = new Person(null,0);
        Person p4 = new Person(null,0);
        ArrayList<Person> aL1 = new ArrayList<>();
        ArrayList<Person> aL2 = new ArrayList<>();
        aL1.add(p1);
        aL1.add(p2);
        aL1.add(p3);
        aL1.add(p1);
        aL1.add(p2);
        aL1.add(p4);
        Boolean b = aL1.addAll(aL2);
        int actual=aL1.size();
        int expected=6;
        Assert.assertFalse(b);
        Assert.assertEquals(expected,actual);
    }

}
