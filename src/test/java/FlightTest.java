import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FlightTest {
    Flight flight;
    Plane plane;

    @Before
    public void before(){
        plane = new Plane(PlaneType.BOEING, PlaneAirline.BRITISHAIRWAYS);
        flight = new Flight(plane, 44, "Edinburgh");
    }

    @Test
    public void hasPlane(){
        assertEquals(plane, flight.getPlane());
    }

    @Test
    public void hasFlightNumber(){
        assertEquals(44, flight.getFlightNumber());
    }

    @Test
    public void hasDestination(){
        assertEquals("Edinburgh", flight.getDestination());
    }

}
