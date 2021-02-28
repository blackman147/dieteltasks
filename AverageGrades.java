import java.util.Scanner;

public class AverageGrades {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
       double result = 0;
        int count = 0;

        while(count < 10){
            System.out.println("Enter students score: ");
            double score = input.nextDouble();
            if (score >= 1 && score <= 100) {
                result += score;
                count++;
            }

        }

        double average = result/ (count)*1.0;
                System.out.print("Average equals: " + average);
    }



}
