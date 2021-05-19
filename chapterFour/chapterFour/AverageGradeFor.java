package chapterFour;

import java.util.Scanner;

public class AverageGradeFor {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double result = 0;
        int count = 0;

        for( count=0; count < 10; ){
            System.out.println("Enter students score: ");
            double score = input.nextDouble();
            if (score >= 0)  {
                result += score;
                count++;
            }
            else {
                System.out.println("this is an in valid input");
            }
        }
        double average = result/ (count)*1.0;
        System.out.print("Average equals: " + average);
    }
}
