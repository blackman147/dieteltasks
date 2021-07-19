package ChapterFive;

import java.util.Scanner;

public class ModifiedDiamondPrinting {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number of lines for Diamond: ");
        int numberOfSpaces = scanner.nextInt();
        int lines = 0;
        if(numberOfSpaces > 0 && numberOfSpaces < 20){
            if(numberOfSpaces % 2 == 1){
                lines = numberOfSpaces + 1;
            } else{

                lines = numberOfSpaces;
            }
        }else{
            System.out.println("Invalid input - Enter a number between 1 - 19");
        }

        int stars = 1;
        int div = lines/2+1;
        int spaces = 20;

        for(int i = 1; i <= lines; i++){
            for(int s = spaces; s> 0; s--){
                System.out.print(" ");
            }
            for (int a = stars; a > 0; a--){
                System.out.print("* ");
            }
            if(i < div){
                spaces -=2; stars +=2;
                System.out.println();
            }else if(i >= div){
                spaces+=2; stars-=2;
                System.out.println();
            }
        }
    }
}

