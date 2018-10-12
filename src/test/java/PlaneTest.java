import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PlaneTest {
    Plane plane;

    @Before
    public void before(){
        plane = new Plane(PlaneType.BOEING, PlaneAirline.BRITISHAIRWAYS);
    }

    @Test
    public void planeHasType(){
        assertEquals(PlaneType.BOEING, plane.getType());
    }

    @Test
    public void planeHasAirline(){
        assertEquals(PlaneAirline.BRITISHAIRWAYS, plane.getAirline());
    }

    @Test
    public void planeHasCapacity(){
        assertEquals(420, PlaneType.BOEING.getCapacity());
    }
}
