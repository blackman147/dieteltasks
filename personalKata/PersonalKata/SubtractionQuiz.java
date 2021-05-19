package PersonalKata;

import java.util.Scanner;

public class SubtractionQuiz {
    public static void main(String[] args) {
        final int  QuestionNumber = 10;
        int count = 0;
        int numberOfCorrectAnswers = 0;
        long startTime = System.currentTimeMillis();
        String output = "  ";
        Scanner input = new Scanner(System.in);

        while (count < QuestionNumber){
            int firstNumber = (int) (Math.random() * 10);
            int secondNumber = (int) (Math.random() * 10);

            if ( firstNumber < secondNumber ){
                int temp = firstNumber;
                firstNumber = secondNumber;
                secondNumber = temp;
            }
        }

    }
}
