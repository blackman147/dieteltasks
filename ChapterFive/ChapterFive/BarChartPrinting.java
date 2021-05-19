package ChapterFive;

import java.util.Scanner;

public class BarChartPrinting {
    public static void main(String[] args) {
        int firstNumber = 0;
        int secondNumber = 0;
        int thirdNumber = 0 ;
        int fourthNumber = 0;
        int fifthNumber = 0;
        int number = 0;
        int counter = 1;

        Scanner input = new Scanner(System.in);

        while (counter < 6){

            System.out.println("Enter a number: ");
            number = input.nextInt();

            if (counter == 1 && number >= 1 && number <= 30){
                firstNumber = number;
                counter++;
            }else if (counter == 2 && number >= 1 && number <= 30){
                secondNumber = number;
                counter++;
            }else if (counter == 3 && number >= 1 && number <= 30){
                thirdNumber = number;
                counter++;
            }else if (counter == 4 && number >= 1 && number <= 30){
                fourthNumber = number;
                counter++;
            }else if (counter == 5 && number >= 1 && number <= 30){
                fifthNumber = number;
                counter++;
            }else
                System.out.println("invalid input !!!");
        }



        int stars = 0;
        for (int i = 0; i < 5; i++) {
            if (i == 0) {
                stars = firstNumber;
            } else if (i == 1) {
                stars = secondNumber;
            } else if (i == 2) {
                stars = thirdNumber;
            } else if (i == 3) {
                stars = fourthNumber;
            } else if (i == 4) {
                stars = fifthNumber;
            }
            for (int j = stars; j > 0; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
