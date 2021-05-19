package chapterThree;

import java.util.Scanner;

public class SeparatingTheDigits0fAnInteger {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a five digit Number: ");

        int number = scan.nextInt();

        int firstDigit = number/10000;

        int secondNumber = number % 10000;

        int secondDigit = secondNumber/1000;

        int  thirdNumber = number % 1000;

        int thirdDigit = thirdNumber/ 100;

        int fourthNumber = number % 100;

        int fourthDigit = fourthNumber / 10;

        int fifthDigit = fourthNumber % 10;

        System.out.println(firstDigit + " " + secondDigit + " " + thirdDigit + " " + fourthDigit + " " + fifthDigit + " ");




    }
}
