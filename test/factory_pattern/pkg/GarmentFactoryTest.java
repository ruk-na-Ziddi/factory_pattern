package factory_pattern.pkg;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by ankurks on 7/13/16.
 */
public class GarmentFactoryTest {
    @Test
    public void ShouldGenerateShirtWhenTypeIsShirt() throws Exception {
        Garment shirt = GarmentFactory.generateGarment("shirt", 34,22);
        Shirt shirt1 = new Shirt(34, 22);
        assertEquals(shirt.toString(), shirt1.toString());
    }

    @Test
    public void ShouldGenerateTrouserWhenTypeIsTrouser() throws Exception {
        Garment trouser = GarmentFactory.generateGarment("trouser", 28, 38);
        Trouser trouser1 = new Trouser(28, 38);
        assertEquals(trouser.toString(), trouser1.toString());
    }
}
