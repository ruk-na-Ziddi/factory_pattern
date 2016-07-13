package factory_pattern.pkg;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by ankurks on 7/13/16.
 */
public class TrouserTest {
    @Test
    public void ShouldCreateTrouserOfGivenLenght(){
        Trouser trouser = new Trouser(28, 38);
        assertEquals(38, trouser.getLenght());
    }
    @Test
    public void ShouldCreateTrouserOfGivenPeriMeter(){
        Trouser trouser = new Trouser(28, 38);
        assertEquals(28, trouser.getPeriMeter());
    }
    @Test
    public void ShouldCreateTrouserOfGivenPeriMeterAndLenght(){
        Trouser trouser = new Trouser(28, 38);
        assertEquals(38, trouser.getLenght());
        assertEquals(28, trouser.getPeriMeter());
    }
    @Test
    public void ShouldGiveLenghtAndPeriMeterInFormatWhenToStringIsCalled(){
        Trouser trouser = new Trouser(28, 38);
        assertEquals("Lenght is: 38 and perimeter is :28", trouser.toString());
    }
}
