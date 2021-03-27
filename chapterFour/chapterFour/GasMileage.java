package chapterFour;

import java.util.Scanner;

public class GasMileage {
    public static void main(String[] args) {
        int milesDriven = 1;
        int gallonsUsed = 0;
        double totalMilesPerGallons = 0;
        double milesPerGallons = 0;
        Scanner scan = new Scanner(System.in);
        while (milesDriven != -1 && gallonsUsed != -1){

            if (milesDriven <=0 && gallonsUsed <=0){
                System.out.println("invalid selection try again");
            }

           System.out.println("Enter the miles driven for this trip  ");
           milesDriven = scan.nextInt();


           System.out.println("input the number of gallons used");
           gallonsUsed = scan.nextInt();
           milesPerGallons = (double) milesDriven / gallonsUsed;
           totalMilesPerGallons += milesPerGallons;




       }
        if(milesDriven > 0 && gallonsUsed > 0 ) {
            System.out.println("In this trip you have used " + milesPerGallons + " Miles per gallon");
            System.out.println("your total miles  per gallon is: " + totalMilesPerGallons);
        }
    }
}
