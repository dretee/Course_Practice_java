package chapter9.cakeProject;

import java.util.HashMap;
import java.util.Map;

public class Cake {
    private String flavour;
    private double price;
    int tires;
    int numberofcakes;
    int size;

    Cake(String flavour, int numberofcakes) {
        this.flavour = flavour;
        this.numberofcakes = numberofcakes;

    }

    Cake(String flavour, int numberofcakes, int tires) {
        this.flavour = flavour;
        this.numberofcakes = numberofcakes;
        this.tires = tires;

    }

    public String getFlavour() {
        return flavour;
    }

    public void setFlavour(String flavour) {
        this.flavour = flavour;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getNumber_of_cakes() {
        return numberofcakes;
    }

    public void setNumber_of_cakes(int numberofCakes) {
        this.numberofcakes = numberofCakes;
    }

    public double UnitPricing() {
        String CakeFlavour = getFlavour();
        Map<Integer, String> catalog = price();
        for (Map.Entry<Integer, String> entry : catalog.entrySet()) {
            if (entry.getValue().equalsIgnoreCase(CakeFlavour)) {
                return entry.getKey();
            }
        }
        return 0.00;
    }

    public Map<Integer, String> price() {
        int size_of_cake = getSize();
        if (size_of_cake == 6) {
            return SizeSix();
        } else if (size_of_cake == 7) {
            return SizeSeven();
        } else if (size_of_cake == 8) {
            return SizeEight();
        } else if (size_of_cake == 9) {
            return SizeNine();
        }
        else
        return SizeSix();
    }

    public  Map<Integer, String> SizeSix() {
        Map<Integer, String> six_Inches = new HashMap<Integer, String>();
        six_Inches.put(100, "Almond");
        six_Inches.put(125, "Red Velvet");
        six_Inches.put(130, "Chocolate");
        six_Inches.put(90, "Vanilla");
        six_Inches.put(134, "Coffee");
        return six_Inches;
    }
    public Map<Integer, String> SizeSeven( ){
        Map<Integer, String> seven_Inches = new HashMap<Integer, String>();
        seven_Inches.put(125, "Almond");
        seven_Inches.put(150, "Red Velvet");
        seven_Inches.put(155, "Chocolate");
        seven_Inches.put(115, "Vanilla");
        seven_Inches.put(157, "Coffee");
        return seven_Inches;
    }
    public Map<Integer, String>SizeEight() {
        Map<Integer, String> Eight_Inches = new HashMap<Integer, String>();
        Eight_Inches.put(155, "Almond");
        Eight_Inches.put(190, "Red Velvet");
        Eight_Inches.put(185, "Chocolate");
        Eight_Inches.put(150, "Vanilla");
        Eight_Inches.put(177, "Coffee");
        return Eight_Inches;
    }
    public Map<Integer, String> SizeNine() {
        Map<Integer, String> Nine_Inches = new HashMap<>();
        Nine_Inches.put(188, "Almond");
        Nine_Inches.put(230, "Red Velvet");
        Nine_Inches.put(210, "Chocolate");
        Nine_Inches.put(190, "Vanilla");
        Nine_Inches.put(200, "Coffee");
        return Nine_Inches;
    }




}
