package chapterFour;

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
}
