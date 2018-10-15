import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AirportTest {

    Airport airport;

    @Before
    public void before(){
        airport = new Airport(AirportCode.EDI);
    }

    @Test
    public void hasAirportCode(){
        assertEquals(AirportCode.EDI, airport.getCode());
    }

    @Test
    public void startsEmpty(){
        assertEquals(0, airport.getPlanes().size());
    }

    @Test
    public void canCreateFlight(){
        airport.addPlaneToHanger(new Plane(PlaneType.BOEING, PlaneAirline.BRITISHAIRWAYS));
        assertEquals(1, airport.getPlanes().size());
        Flight newFlight = airport.createFlight(44, "Edinburgh");
        assertEquals( 44, newFlight.getFlightNumber());
    }
//
//    @Test
//    public void canSellTicket(){
//
//    }
}
