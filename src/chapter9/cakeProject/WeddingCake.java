package chapter9.cakeProject;

public class WeddingCake extends Cake {
    int tires;
    WeddingCake(){
        super("red velvet", 6);
    }

    public int getTires() {
        return tires;
    }

    public void setTires(int tires) {
        this.tires = tires;
    }
    public double price_the_WeddingCake(double unitPrice) {
        return (unitPrice * tires);
    }
}
