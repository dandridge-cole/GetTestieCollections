package rocks.zipcode;

import org.junit.Assert;
import org.junit.Test;

import java.util.PriorityQueue;

public class TestPriorityQueue {

    @Test

    public void priorityQueueTestAddAndSize(){
        Address a1 = new Address("Street","Town","Postal Code","Country");
        Address a2 = new Address("Street","Town","Postal Code","That Country");
        Address a3 = new Address("Street","Town","Postal Code","This Country");
        Address a4 = null;
        PriorityQueue pQ = new PriorityQueue();
        pQ.add(a1);
        pQ.add(a3);
        pQ.add(a2);
        int expected = 3;
        int actual = pQ.size();
        Assert.assertEquals(expected,actual);
    }
}
