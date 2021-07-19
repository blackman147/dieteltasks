package ChapterSix;

import java.security.SecureRandom;
import java.util.Scanner;

public class GuessGame {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        SecureRandom secureRandom=new SecureRandom();
        int correctScore=secureRandom.nextInt(1000);
        int counter=0;
        System.out.println("Input userInput");

        while(counter<3) {
            int userInput = sc.nextInt();
            if (userInput >= 0 && userInput <= 1000) {
                if (userInput == correctScore) {
                    System.out.println("Correct ");
                    break;
                } else if (userInput > correctScore) {
                    System.out.println("To high ");
                } else System.out.println("Too low ");

            }else System.out.println("Invalid Number");

            counter++;
        }
        System.out.println("wrong Number! The right guess is  "+correctScore);
    }
}
