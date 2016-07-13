package factory_pattern.pkg;

/**
 * Created by ankurks on 7/13/16.
 */
public abstract class Garment {
    public abstract int getPeriMeter();
    public abstract int getLenght();

    @Override
    public String toString(){
        return "Lenght is: "+this.getLenght()+" and perimeter is :"+this.getPeriMeter();
    };
}
