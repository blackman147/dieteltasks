import java.util.Scanner;

public class GuessGame {
    public static void main(String[] args) {
        Scanner guess = new Scanner(System.in);
        int number = 77;
        int userGuess = 0;


        while (userGuess != number) {
            System.out.println("Enter Number to Guess");
            userGuess = guess.nextInt();

            if (userGuess == number) {
                System.out.printf("You guessed right", number);
            }

            if (userGuess != number) {
                System.out.printf("Try Again ", number);
            }

        }
    }
}
