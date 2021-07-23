package chapterThree;

import java.util.Scanner;

public class HealthRecordsTest {
    public static void main(String[] args) {
        HealthRecords2 healthRecords = new HealthRecords2 ("firstname", "lastname", "male", 170.00, 80.00);
        Scanner userInput = new Scanner(System.in);

        System.out.println("Enter your first name: " );
        String firstName = userInput.next();
        healthRecords.setFirstName(firstName);

        System.out.println("Enter your last name: " );
        String lastName = userInput.next();
        healthRecords.setLastName(lastName);

        System.out.println("Enter your Gender: " );
        String gender = userInput.next();
        healthRecords.setGender(gender);

        System.out.println("Enter your height in inches: " );
        double height = userInput.nextDouble();
        healthRecords.setHeight(height);

        System.out.println("Enter your weight in pounds: " );
        double weight = userInput.nextDouble();
        healthRecords.setWeight(weight);

        System.out.println("Enter your day of birth: " );
        int day = userInput.nextInt();
        healthRecords.setDay(day);

        System.out.println("Enter your month of birth " );
        int month = userInput.nextInt();
        healthRecords.setMonth(month);

        System.out.println("Enter your year of birth: " );
        int year = userInput.nextInt();
        healthRecords.setYear(year);


        System.out.println("full name of patient is: " + healthRecords.getFirstName() + " " + healthRecords.getLastName());
        System.out.println("Date of Birth of patient: " + healthRecords.getDay() + " /" + healthRecords.getMonth() + " /" + healthRecords.getYear());
        System.out.println("Patient Age: " + healthRecords.calculateAge());
        System.out.println("Patient Gender: " + healthRecords.getGender());
        System.out.println("Patient Height: " + healthRecords.getHeight());
        System.out.println("Patient maximum heartrate " + healthRecords.maximumHeartRate());
        System.out.println("patient target heartrate: " + healthRecords.targetHeartRate());
        System.out.println();
        System.out.println("BMI VALUES");
        System.out.println("BMI = " + healthRecords.BMICalculator());
        System.out.println("Underweight: less than 18.5");
        System.out.println("Normal: between 18.5 and 29.9");
        System.out.println("Obese: 30 or greater");

    }
}
