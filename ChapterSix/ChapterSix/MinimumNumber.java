package ChapterSix;

import java.util.Scanner;

public class MinimumNumber {

    public static float minimumThree(float numberOne, float numberTwo, float numberThree ){
        float result = Math.min(Math.min(numberOne, numberTwo), numberThree);
        return result;
    }

    public static void main(String[] args) {


        for (int i = 1; i <= 3 ; i++) {
            if (i == 1){
                System.out.println("Enter number one: ");

            }else if (i == 2){
                System.out.println("Enter number Two: ");

            }else if (i == 3){
                System.out.println("Enter number Three");
            }

        }
        System.out.println("The minimum value is: " + minimumThree(3, 5, 7));
    }
}