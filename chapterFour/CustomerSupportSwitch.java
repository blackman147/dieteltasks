package chapterFour;

import java.util.Scanner;

public class CustomerSupportSwitch {
    public static void main(String[] args) {
            String promptMessage = """
                    -> press 1 for Igbo.
                    -> press 2 for Hausa.
                    -> press 3 for Yoruba.
                    -> press 4 for English.
                    
                    """;
        System.out.println(promptMessage);
        Scanner userInputCollector = new Scanner(System.in);
        int userInput = userInputCollector.nextInt();
        switch (userInput){
            case 1:
                System.out.println("Igbo Kwenu!!!");
                break;
            case 2:
                System.out.println("Aboki zo!!!");
                break;
            case 3:
                System.out.println("kilonsheke!!!");
                break;
            case 4:
                System.out.println("hello pink people!!!");
                break;
            default:
                    System.out.println("Get lost!!!!!");

        }
    }
}
