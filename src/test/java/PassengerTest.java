import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

/**
 * Created by vdabcursist on 07/09/2017.
 */
public class PassengerTest {
    @Test
    public void passengerHasFirstName() {
        Passenger p = new Passenger("Jimi", "Hendrickx");
        assertEquals("Jimi", p.getFirstname());

    }
    @Test
    public void passengerHasCorrectFullname(){
        Passenger p = new Passenger("Jimi","Hendrickx");
        assertEquals("Jimi Hendrickx", p.fullName());
    }

}
