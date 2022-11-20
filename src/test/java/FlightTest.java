import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FlightTest {
    Flight flight;
    Passenger passenger;
    @Before
    public void before(){
        flight= new Flight("Jumbo", 10, 10000, 1, "Athens", "Gla", "10:00");
        passenger = new Passenger("Joe");
    }
    @Test
    public void flightHasPlaneType(){
        assertEquals("Jumbo", flight.getPlaneType());
    }
    @Test
    public void flightHasCapacity(){
        assertEquals(10, flight.getCapacity());
    }
    @Test
    public void flightHasTotalWeight(){
        assertEquals(10000, flight.getTotalWeight());
    }
    @Test
    public void flightHasFlightNo(){
        assertEquals(1, flight.getFlightNo());
    }
    @Test
    public void flightHasDestination(){
        assertEquals("Athens", flight.getDestination());
    }
    @Test
    public void flightHasDepartureAirport(){
        assertEquals("Gla", flight.getDepartureAirport());
    }
    @Test
    public void flightHasDepartureTime(){
        assertEquals("10:00", flight.getDepatureTime());
    }
    @Test
    public void canAddPassengers(){
        flight.addPassenger(passenger);
        assertEquals(1, flight.checkPassengers());
    }

}
