package ChapterSeven;

import java.util.Scanner;


public class SalesCommissions {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int userInput = 0;

        int [] earningCounter = new int [9];
        do {
            System.out.println("Enter the amount sold: ");
            double amount = scan.nextDouble();

            double earnings = 200 + (0.09 * amount);
            int index = (int) (earnings / 100);

            switch (index) {
                case 2 -> ++earningCounter[0];
                case 3 -> ++earningCounter[1];
                case 4 -> ++earningCounter[2];
                case 5 -> ++earningCounter[3];
                case 6 -> ++earningCounter[4];
                case 7 -> ++earningCounter[5];
                case 8 -> ++earningCounter[6];
                case 9 -> ++earningCounter[7];
                case 10 -> ++earningCounter[8];
            }
            System.out.println("your earnings is: " + earnings);
            System.out.println("press 1 to continue");
            userInput = scan.nextInt();


//            if (earnings >= 200 && earnings < 300)
//                ++earningCounter[0];
//            else if (earnings >= 300 && earnings < 400)
//                ++earningCounter[1];
//            else if (earnings >= 400 && earnings < 500)
//                ++earningCounter[2];
//            else if (earnings >= 500 && earnings < 600)
//                ++earningCounter[3];
//            else if (earnings >= 600 && earnings < 700)
//                ++earningCounter[4];
//            else if (earnings >= 700 && earnings < 800)
//                ++earningCounter[5];
//            else if (earnings >= 800 && earnings < 900)
//                ++earningCounter[6];
//            else if (earnings >= 900 && earnings < 1000)
//                ++earningCounter[7];
//            else if (earnings >= 1000)
//                ++earningCounter[8];


        }while (userInput != 0);

        for (int counter : earningCounter){
            System.out.println(counter);
        }


    }
}
