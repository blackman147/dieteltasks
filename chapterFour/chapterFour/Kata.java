package chapterFour;

import javax.swing.*;
import java.util.Scanner;

public class Kata {

    public double calculateAverage(int firstNumber, int secondNumber, int thirdNumber) {
        double average = (firstNumber + secondNumber + thirdNumber) / 3.0;
        return average;

    }

    public String calculateGrade(int grade) {
        if (grade >= 90) {
            return "A";
        }
        if (grade >= 80) {
            return "B";
        }
        if (grade >= 70) {
            return "C";
        }
        if (grade <= 69) {
            return "F";
        } else {
            return null;
        }
    }

    public boolean isEven(int number) {

        if (number % 2 == 0)
            return true;
        else
            return false;


    }

    public boolean isPrimeNumber(int number) {
        if (number == 1){
            return true;
        }
         for (int i = 2; i < number; i++){
             if (number % i == 0);
             return false;
         }
        return false;
    }

    public int numberOfCopies(){
        Scanner userInput = new Scanner(System.in);
        System.out.println("Enter number of copies you want: ");
        int numberOfCopies = userInput.nextInt();
        int pricePerCopy =0;
        if (numberOfCopies > 0) {
            if (numberOfCopies  <= 4) {
                pricePerCopy = numberOfCopies * 1500;
            }

            if (numberOfCopies > 5 && numberOfCopies <= 9) {
                pricePerCopy = numberOfCopies * 1400;
            }
            if (numberOfCopies > 10 && numberOfCopies <= 19) {
                pricePerCopy = numberOfCopies * 1300;
            }
            if (numberOfCopies > 20 && numberOfCopies <= 29) {
                pricePerCopy = numberOfCopies * 1200;
            }
            if (numberOfCopies > 30 && numberOfCopies <= 39) {
                pricePerCopy = numberOfCopies * 1100;
            }
            if (numberOfCopies > 40 && numberOfCopies <= 50) {
                pricePerCopy = numberOfCopies * 1000;
            }
            if (numberOfCopies > 50 && numberOfCopies <= 10) {
                pricePerCopy = numberOfCopies * 900;
            }
            if (numberOfCopies > 100 && numberOfCopies <= 200) {
                pricePerCopy = numberOfCopies * 800;
            }
        } else {
            System.out.println("invalid number");
        }


        return pricePerCopy;




    }
}
