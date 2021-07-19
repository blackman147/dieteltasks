package ChapterSix;

import java.security.SecureRandom;
import java.util.Scanner;

public class ModifiedGuessGame {
    public static void guessNumberGame() {
        Scanner scanner = new Scanner(System.in);
        SecureRandom secureRandom = new SecureRandom();
        int correctScore = secureRandom.nextInt(1000);
        int counter = 0;

        System.out.println("Input -1 to exit");

        while (counter != -1) {
            System.out.println("Input userInput");
            int userInput = scanner.nextInt();
            if (userInput >= 0 && userInput <= 1000) {
                if (userInput == correctScore) {
                    System.out.println("Correct ");

                    break;
                } else if (userInput > correctScore) {
                    System.out.println("To high ");
                    //  count++;
                } else System.out.println("Too low ");

            } else System.out.println("Invalid Number");

            counter++;
        }
        System.out.println("You tried " + counter + " times");
        System.out.println(checker(counter));
        System.out.println(" The right guess is  " + correctScore);
    }
    public static String checker(int counter){
        String report="";
        if (counter<=10){
            report="You know the secret or you are just lucy";
        }
        else if (counter>10){
            report="You should be able to do better";
        }
        return report;
    }

    public static void main(String[] args) {
        guessNumberGame();
    }
}
