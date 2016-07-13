package factory_pattern.pkg;

public class Shirt extends Garment{
    private int periMeter;
    private int length;

    public Shirt(int periMeter, int length){
        this.periMeter = periMeter;
        this.length = length;
    }

    @Override
    public int getPeriMeter(){
        return this.periMeter;
    }

    @Override
    public int getLenght(){
        return this.length;
    }
}
