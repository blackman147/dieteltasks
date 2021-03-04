package chapterThree;

import java.util.Scanner;

public class BMICalculator {
    public static void main(String[] args) {
        double weight;
        double height;
        double bmi;
        Scanner userInput = new Scanner(System.in);

        System.out.println("Enter your Weight in Pounds: ");
        weight = userInput.nextInt();

        System.out.println("Enter your height in inches: ");
        height = userInput.nextInt();

        bmi = (weight * 703)/(height * height);

        System.out.println("BMI VALUES");
        System.out.println("BMI = " + bmi);
        System.out.println("Underweight: less than 18.5");
        System.out.println("Normal: between 18.5 and 29.9");
        System.out.println("Obese: 30 or greater");

    }
}
