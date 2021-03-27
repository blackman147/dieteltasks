package chapterFour;

import java.util.Scanner;

public class SetOfNumber {
    public static void main(String[] args) {

        Scanner set = new Scanner(System.in);
        int counter = 1;
        int userInput = 0;
        int minimumNumber = 0;
        int maximumNumber = 0;
        minimumNumber = maximumNumber;


        for (; counter <= 5; counter++) {
            System.out.println("Enter a number: ");
            userInput = set.nextInt();


            if (userInput > maximumNumber)
                maximumNumber = userInput;


            if (userInput < minimumNumber)
                minimumNumber = userInput;


        }
            System.out.println("this is the highest number: " + maximumNumber);

            System.out.println("this is the smallest number: " + minimumNumber);


    }
}

