package ChapterSeven;

import java.security.SecureRandom;

public class Dice {
    public static void main(String[] args) {
        SecureRandom generator = new SecureRandom();
        int [] array = new int[6];
        int counterOne = 0;
        int counterTwo = 0;
        int counterThree = 0;
        int counterFour = 0;
        int counterFive = 0;
        int counterSix = 0;

        for (long i = 0; i < 60000000l; i++) {
            int dice = generator.nextInt(6);

            switch(dice){
                case 1:
                    array[0] = counterOne;
                    counterOne++;
                case 2:
                    array[1] = counterTwo;
                    counterTwo++;
                case 3:
                    array[2] = counterThree;
                    counterThree++;
                case 4:
                    array[3] = counterFour;
                    counterFour++;
                case 5:
                    array[4] = counterFive;
                    counterFive++;
                case 6:
                    array[5] = counterSix;
                    counterSix++;


            }

        }
        System.out.println("Face One:  " + counterOne);
        System.out.println("Face Two:  " + counterTwo);
        System.out.println("Face Three:  " + counterThree);
        System.out.println("Face Four:  " + counterFour);
        System.out.println("Face Five:  " + counterFive);
        System.out.println("Face Six:  " + counterSix);
    }
}
