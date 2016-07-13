package factory_pattern.pkg;

/**
 * Created by ankurks on 7/13/16.
 */
public class GarmentFactory {
    public static Garment generateGarment(String type, int periMeter, int length) throws Exception {
        switch (type) {
            case "shirt":
                return new Shirt(periMeter, length);
            case "trouser":
                return new Trouser(periMeter, length);
        }
        throw new Exception("Strange Garment");
    }
}
