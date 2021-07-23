package Personalkata;



import java.util.Scanner;

public class HealthRecordsTest {
    public static void main(String[] args) {
       HealthRecords2 hr = new HealthRecords2 ("firstname", "lastname", "gender", 3, 12,1992,170.00,80 );
        Scanner userInput = new Scanner (System.in);

        System.out.println ("Enter your first name: " );
        String firstName = userInput.nextLine ( );
        hr.setFirstName (firstName);

        System.out.println ("Enter your lastname: " );
        String lastName = userInput.nextLine ( );
        hr.setFirstName (lastName);

        System.out.println ("Enter your gender: " );
        String gender = userInput.nextLine ( );
        hr.setFirstName (gender);

        System.out.println("Enter your height in inches: " );
        double height = userInput.nextDouble();
        hr.setHeight(height);

        System.out.println("Enter your weight in pounds: " );
        double weight = userInput.nextDouble();
        hr.setWeight(weight);

        System.out.println("Enter your day of birth: " );
        int day = userInput.nextInt();
        hr.setDay(day);

        System.out.println("Enter your month of birth " );
        int month = userInput.nextInt();
        hr.setMonth(month);

        System.out.println("Enter your year of birth: " );
        int year = userInput.nextInt();
        hr.setYearOfBirth (year);


        System.out.println("full name of patient is: " + hr.getFirstName () + " " + hr.getLastName());
        System.out.println("Date of Birth of patient: " + hr.getDay() + " / " + hr.getMonth() + " / " + hr.getYearOfBirth ());
        System.out.println("Patient Age: " + hr.calculateAge());
        System.out.println("Patient Gender: " + hr.getGender());
        System.out.println("Patient Height: " + hr.getHeight());
        System.out.println("Patient maximum heart rate " + hr.maximumHeartRate());
        System.out.println("patient target heart rate: " + hr.targetHeartRate());
        System.out.println();
        System.out.println("BMI VALUES");
        System.out.println("BMI = " + hr.calculateBmi ());
        System.out.println("Underweight: less than 18.5");
        System.out.println("Normal: between 18.5 and 29.9");
        System.out.println("Obese: 30 or greater");

    }
}
