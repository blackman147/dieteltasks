package PersonalKata;

import java.util.Scanner;

public class GuessGame2 {
    public static void main(String[] args) {
        int number = (int)(Math.random() * 100);

        Scanner scan = new Scanner(System.in);
        System.out.println("Guess the correct number between 1 and 100");

        int guess = -1;
        while(guess != number){

            System.out.println("Enter a Number");
            guess = scan.nextInt();

            if (guess == number){
                System.out.println(" You got the correct number!!!!!!!");
            }

           else if (guess > number)
                System.out.println("Number guessed too high Try again");
            else
                System.out.println("Number guessed too low Try again");

        }

    }
}
