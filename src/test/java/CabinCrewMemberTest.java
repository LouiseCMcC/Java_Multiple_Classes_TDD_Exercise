import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CabinCrewMemberTest {
    CabinCrewMember cabinCrewMember;
    @Before
    public void before(){
        cabinCrewMember = new CabinCrewMember("Jackie", 1);
    }

    @Test
    public void cabinCrewMemberHasName (){
        assertEquals("Jackie", cabinCrewMember.getName());
    }

    @Test
    public void cabinCrewMemberHasRank(){
        assertEquals(1, cabinCrewMember.getRank());
    }

    @Test
    public void canSpeakToPassengers(){
        assertEquals("exits are here", cabinCrewMember.speakToPassengers());
    }
}
