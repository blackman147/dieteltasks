package PersonalKata;

import java.util.Scanner;

public class GasMileage {
    public static void main(String[] args) {
        int milesDriven = 0;
        int gallonsUsed = 0;
        double milesPerGallons = 0;
        double totalMilesPerGallons = 0;
        Scanner userInput = new Scanner (System.in);

        while(milesDriven != -1 && gallonsUsed != -1){

            if (milesDriven < 0 && gallonsUsed < 0){
                System.out.println ("You have entered an invalid number!!!!!" );
            }

            System.out.println ("Enter miles driven for this trip or enter -1 to quit" );
            milesDriven = userInput.nextInt ();


            System.out.println ("Enter gallons used for this trip or enter -1 to quit" );
            gallonsUsed = userInput.nextInt ();

            milesPerGallons = ((double) milesDriven / gallonsUsed);
            totalMilesPerGallons += milesPerGallons;
        }

        if (milesDriven == -1 && gallonsUsed == -1){
            System.out.println ("the miles per gallon used for this trip is: " + milesPerGallons );
            System.out.println ("the total miles per gallons is: " + totalMilesPerGallons );
        }
    }
}
