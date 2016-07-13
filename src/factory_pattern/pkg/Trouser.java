package factory_pattern.pkg;

/**
 * Created by ankurks on 7/13/16.
 */
public class Trouser extends Garment{
    private final int periMeter;
    private final int lenght;

    public Trouser(int periMeter, int lenght){
        this.periMeter = periMeter;
        this.lenght = lenght;
    }

    @Override
    public int getLenght(){
        return this.lenght;
    }

    @Override
    public int getPeriMeter(){
        return this.periMeter;
    }
}
