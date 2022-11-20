import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PassengerTest {

    Passenger passenger;
    Bag bag;

    @Before
    public void before(){
        passenger=new Passenger("Jack");
        bag=new Bag();
    }

    @Test
    public void passengerHasName(){
        assertEquals("Jack", passenger.getName());
    }

    @Test
    public void canCountPassengerBags(){
        passenger.addBag(bag);
        assertEquals(1, passenger.countBags());
    }
}
