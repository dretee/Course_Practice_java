package chapter9.cakeProject;

import org.checkerframework.checker.units.qual.C;

public class BirthdayCakes extends Cake {
    private int nosOfCandles;

    BirthdayCakes(){
        super("vanilla", 4);

    }

    public int getNosOfCandles() {
        return nosOfCandles;
    }

    public void setNosOfCandles(int nosOfCandles) {
        this.nosOfCandles = nosOfCandles;
    }
    public double price_the_Cake(double unitPrice, int numbersOfCake){
       final double priceOfCandle = 0.5;
        return (unitPrice * numbersOfCake)+(nosOfCandles* priceOfCandle);
    }
}
