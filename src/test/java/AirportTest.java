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

//    @Test
//    public void startsEmpty(){
//
//    }
//
//    @Test
//    public void canCreateFlight(){
//
//    }
//
//    @Test
//    public void canSellTicket(){
//
//    }
}
