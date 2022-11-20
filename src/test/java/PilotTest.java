import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PilotTest {
    Pilot pilot;
    @Before
    public void before(){
        pilot = new Pilot("Mac", 1, 1);
    }

    @Test
    public void pilotHasName(){
        assertEquals("Mac", pilot.getName());
    }
    @Test
    public void pilotHasRank(){
        assertEquals(1, pilot.getRank());
    }
    @Test
    public void pilotHasLicenceNo(){
        assertEquals(1, pilot.getLicenceNo());
    }

    @Test
    public void canFlyPlane(){
        assertEquals("Commencing ascent", pilot.fliesPlane());
    }
}
