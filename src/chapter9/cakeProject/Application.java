package chapter9.cakeProject;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
      BirthdayCakesPricesCalculator();


    }
    public static void BirthdayCakesPricesCalculator(){
        Cake birthday = new BirthdayCakes();

        // enter the cake size
        System.out.println(" Enter the size of cake: ");
        Scanner scan= new Scanner(System.in);
        int size = scan.nextInt();
        birthday.setSize(size);

        // enter the flavour of the cake
        System.out.println(" Enter the flavour of the cake: ");
        String flavour = scan.next();
        birthday.setFlavour(flavour);



        // enter the flavour of the cake
        System.out.println(" Enter the number of cakes: ");
        int numberofcakes = scan.nextInt();
        birthday.setFlavour(flavour);

        // enter the number of candles for the cake
        BirthdayCakes BC = new BirthdayCakes();
        System.out.println(" Enter the number candles for the cakes: ");
        int numberofcandles = scan.nextInt();
        BC.setNosOfCandles(numberofcandles);

        double PRICE = birthday.UnitPricing();
        double checkOutPrice = BC.price_the_Cake(PRICE,numberofcakes );
        System.out.println(" You ordered: "+ numberofcakes +" cakes, with flavour "+ flavour +" of unit price: "+ PRICE);
        System.out.println(" The cake would cost: "+ checkOutPrice);
        scan.close();
    }
}
