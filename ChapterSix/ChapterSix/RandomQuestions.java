package ChapterSix;

import java.security.SecureRandom;
import java.util.Scanner;

public class RandomQuestions {
    public static void main(String[] args) {
        SecureRandom generator = new SecureRandom();

        int counter;
        int userAnswer = 0;
        int correctAnswer = 0;
        int wrongAnswer = 0;


        for (counter = 1; counter <= 10; counter++) {
            Scanner scan = new Scanner(System.in);

            int firstRandomNumber = 1 + generator.nextInt(100);
            int secondRandomNumber = 1 + generator.nextInt(100);

            int randomQuestion = 1 + generator.nextInt(4);

            int sum = firstRandomNumber + secondRandomNumber;
            int difference = firstRandomNumber - secondRandomNumber;
            int multiply = firstRandomNumber * secondRandomNumber;
            double divide = firstRandomNumber / secondRandomNumber;


            if (randomQuestion == 1) {
                System.out.println("Question" + counter);
                System.out.println(firstRandomNumber + " + " + secondRandomNumber);
                userAnswer = scan.nextInt();

                if (userAnswer == sum) {
                    System.out.println("correct Answer");
                    correctAnswer++;
                } else {
                    System.out.println("wrong Answer");
                    wrongAnswer++;
                }
            }
            if (randomQuestion == 2) {
                System.out.println("Question" + counter);
                System.out.println(firstRandomNumber + " - " + secondRandomNumber);
                userAnswer = scan.nextInt();

                if (userAnswer == difference) {
                    System.out.println("correct Answer");
                    correctAnswer++;
                } else {
                    System.out.println("wrong Answer");
                    wrongAnswer++;
                }
            }
            if (randomQuestion == 3) {
                System.out.println("Question" + counter);
                System.out.println(firstRandomNumber + " * " + secondRandomNumber);
                userAnswer = scan.nextInt();

                if (userAnswer == multiply) {
                    System.out.println("correct Answer");
                    correctAnswer++;
                } else {
                    System.out.println("wrong Answer");
                    wrongAnswer++;
                }
            }

            if (randomQuestion == 4) {
                System.out.println("Question" + counter);
                System.out.println(firstRandomNumber + " / " + secondRandomNumber);
                userAnswer = scan.nextInt();

                if (userAnswer == divide) {
                    System.out.println("correct Answer");
                    correctAnswer++;
                } else {
                    System.out.println("wrong Answer");
                    wrongAnswer++;
                }
            }

        }


        System.out.println("You got" + correctAnswer + " answers" + "\n you got " + wrongAnswer + "Wrong answers");
    }

}


