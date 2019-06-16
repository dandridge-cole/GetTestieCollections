package rocks.zipcode;

import org.junit.Assert;
import org.junit.Test;

import java.util.*;

public class TestIterator {

    @Test
    public void iteratorTestHasNextTrue() {
        List<Address> aL = new ArrayList<>();
        aL.add(new Address(null,null,null));
        Iterator<Address> myIt = aL.iterator();
        Boolean actual = myIt.hasNext();
        Assert.assertTrue(actual);
    }

    @Test
    public void iteratorTestHasNextFalse() {
        List<Address> aL = new ArrayList<>();
        Iterator<Address> myIt = aL.iterator();
        Boolean actual = myIt.hasNext();
        Assert.assertFalse(actual);
    }

    @Test
    public void iteratorTestRemove() {
        List<Person> aL = new ArrayList<>();
        Person p1 = new Person("John Doe", 1111);
        Person p2 = new Person("Jawn D'oh", 1222);
        Person p3 = new Person("Jane Dai", 1333);
        aL.add(p1);
        aL.add(p2);
        aL.add(p3);
        Iterator<Person> myIt = aL.iterator();
        while(myIt.hasNext()){
            Person temp = myIt.next();
            if(temp.getYearOfBirth()>1200) myIt.remove();
        }
        int expected =1;
        int actual = aL.size();
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void iteratorTestContentsAndOrder() {
        List<Person> aL = new ArrayList<>();
        Person p1 = new Person("John Doe", 1111);
        Person p2 = new Person("Jawn D'oh", 1222);
        Person p3 = new Person("Jane Dai", 1333);
        aL.add(p1);
        aL.add(p2);
        aL.add(p3);
        Set<Person> hS = new HashSet<>(aL);
        Iterator<Person> myIt = hS.iterator();
        List<Person> newAL = new ArrayList<>();
        String expected = hS.toString();
        while(myIt.hasNext()) newAL.add(myIt.next());
        String actual=newAL.toString();
        Assert.assertEquals(expected,actual);
    }
}
