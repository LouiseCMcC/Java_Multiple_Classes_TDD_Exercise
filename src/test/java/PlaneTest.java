import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PlaneTest {
    Plane plane;
    @Before
    public void before(){
        plane= new Plane("Private Jet", 10, 1000 );
    }

    @Test
    public void planeHasType(){
        assertEquals("Private Jet", plane.getPlaneType());
    }
    @Test
    public void planeHasCapacity(){
        assertEquals(10, plane.getCapacity());
    }
    @Test
    public void planeHasTotalWeight(){
        assertEquals(1000, plane.getTotalWeight());
    }

}


