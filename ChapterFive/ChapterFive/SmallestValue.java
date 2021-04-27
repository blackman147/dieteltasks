package ChapterFive;

import java.util.Scanner;

public class SmallestValue {
    public static void main(String[] args) {


        int number;
        int smallestNumber = 0 ;

        Scanner scan = new Scanner(System.in);
        System.out.println("How many numbers do your want to compare?");
        int quantityOfNumbersToCompare = scan.nextInt();

        System.out.println("enter a number: ");
        smallestNumber = scan.nextInt();

        for (int i = 0; i < quantityOfNumbersToCompare - 1; i++) {
            System.out.println("enter a number: ");
            number = scan.nextInt();
            if (number < smallestNumber) {
                 smallestNumber = number;
            }
        }

        System.out.println("smallest number = " + smallestNumber);

    }
}
