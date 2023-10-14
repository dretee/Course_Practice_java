package chapter9.cakeProject;

import java.util.Scanner;

public class Application {
    public static Scanner scan= new Scanner(System.in);
    public static void main(String[] args) {
      //BirthdayCakesPricesCalculator();
      WeddingCakesPricesCalculator();
    }
    public static void BirthdayCakesPricesCalculator(){
        Cake birthday = new BirthdayCakes();

        // enter the cake size
        System.out.println(" BIRTHDAY CAKE ORDER ");
        System.out.println(" Enter the size of cake: ");
        int size = scan.nextInt();
        birthday.setSize(size);

        // enter the flavour of the cake
        System.out.println(" Enter the flavour of the cake: ");
        String flavour = scan.next();
        birthday.setFlavour(flavour);

        // enter the number of the cake
        System.out.println(" Enter the number of cakes: ");
        int numberofcakes = scan.nextInt();
        birthday.setNumber_of_cakes(numberofcakes);

        // enter the number of candles for the cake
        BirthdayCakes BC = new BirthdayCakes();
        System.out.println(" Enter the number candles for the cakes: ");
        int numberofcandles = scan.nextInt();
        BC.setNosOfCandles(numberofcandles);

        double PRICE = birthday.UnitPricing();
        double checkOutPrice = BC.price_the_Cake(PRICE,numberofcakes );
        System.out.println(" You ordered: "+ numberofcakes +" cakes, with flavour "+ flavour +" of unit price: "+ PRICE);
        System.out.println(" The cake would cost: "+ checkOutPrice);
    }
    public static void WeddingCakesPricesCalculator(){
        Cake wedding = new WeddingCake();

        // enter the cake size
        System.out.println(" WEDDING CAKE ORDER ");
        System.out.println(" Enter the size of cake: ");
        int size = scan.nextInt();
        wedding.setSize(size);

        // enter the flavour of the cake
        System.out.println(" Enter the flavour of the cake: ");
        String flavour = scan.next();
        wedding.setFlavour(flavour);

        // enter the number of tires for the cake
        WeddingCake WC = new WeddingCake();
        System.out.println(" Enter the number of tires for the cakes: ");
        int numberofTires= scan.nextInt();
        WC.setTires(numberofTires);

        double PRICE = wedding.UnitPricing();
        double checkOutPrice = WC.price_the_WeddingCake(PRICE);
        System.out.println(" You ordered: "+ numberofTires +" tires of cake, with flavour "+ flavour +" of unit price: "+ PRICE);
        System.out.println(" The cake would cost: "+ checkOutPrice);
        scan.close();
    }
}
