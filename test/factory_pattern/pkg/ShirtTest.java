package factory_pattern.pkg;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by ankurks on 7/13/16.
 */
public class ShirtTest {
    @Test
    public void ShouldCreateShirtOfGivenLenght(){
        Shirt shirt = new Shirt(34, 22);
        assertEquals(22, shirt.getLenght());
    }
    @Test
    public void ShouldCreateShirtOfGivenPeriMeter(){
        Shirt shirt = new Shirt(34, 22);
        assertEquals(34, shirt.getPeriMeter());
    }
    @Test
    public void ShouldCreateShirtOfGivenPeriMeterAndLenght(){
        Shirt shirt = new Shirt(34, 22);
        assertEquals(22, shirt.getLenght());
        assertEquals(34, shirt.getPeriMeter());
    }
    @Test
    public void ShouldGiveLenghtAndPeriMeterInFormatWhenToStringIsCalled(){
        Shirt shirt = new Shirt(34, 22);
        assertEquals("Lenght is: 22 and perimeter is :34", shirt.toString());
    }
}