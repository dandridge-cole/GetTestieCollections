package rocks.zipcode;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

public class TestComparable {

    @Test
    public void compareToTestEquals(){
        Address a1 = new Address("Street","Town","Postal Code","Country");
        Address a2 = new Address("Street","Town","Postal Code","Country");
        int expected = 0;
        int actual = a1.compareTo(a2);
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void compareToTestLessCountry(){
        Address a1 = new Address("Street","Town","Postal Code","Country");
        Address a2 = new Address("A Street","A Town","A Postal Code","This Country");
        int actual = a1.compareTo(a2);
        Assert.assertTrue(actual<0);
    }

    @Test
    public void compareToTestGreaterPost(){
        Address a1 = new Address("A Street","A Town","Postal Code","Country");
        Address a2 = new Address("Street","Town","A Postal Code","Country");
        int actual = a1.compareTo(a2);
        Assert.assertTrue(actual>0);
    }

    @Test
    public void compareToTestLessTown(){
        Address a1 = new Address("Street","A Town","Postal Code","Country");
        Address a2 = new Address("A Street","Town","Postal Code","Country");
        int actual = a1.compareTo(a2);
        Assert.assertTrue(actual<0);
    }

    @Test
    public void compareToTestGreaterStreet(){
        Address a1 = new Address("Street","Town","Postal Code","Country");
        Address a2 = new Address("A Street","Town","Postal Code","Country");
        int actual = a1.compareTo(a2);
        Assert.assertTrue(actual>0);
    }

}
