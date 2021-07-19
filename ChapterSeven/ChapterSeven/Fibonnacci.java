package ChapterSeven;

import java.util.Scanner;

public class Fibonnacci {
    public static int fibonnacci(int n){
        int firstNumber= 0;
        int secondNumber = 1;
        int fibonnacciNumber = 0;

        for (int i = 0; i <= n ; i++) {
            fibonnacciNumber = firstNumber + secondNumber;
            firstNumber = secondNumber;
            secondNumber = fibonnacciNumber;
        }
        return fibonnacciNumber;
    }

    public static double fibonnacciTwo(double n){
        double firstNumber= 0.0;
        double secondNumber = 1.0;
        double fibonnacciNumber = 0.0;

        for (int i = 0; i <= n ; i++) {
            fibonnacciNumber = firstNumber + secondNumber;
            firstNumber = secondNumber;
            secondNumber = fibonnacciNumber;

            System.out.println (i + " " );
        }
        return fibonnacciNumber;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);

        System.out.println ("Enter a number: " );
        int userInput = scan.nextInt ();
        System.out.println (fibonnacci (userInput) + " " );
        System.out.println (fibonnacciTwo (userInput) );

    }
}
