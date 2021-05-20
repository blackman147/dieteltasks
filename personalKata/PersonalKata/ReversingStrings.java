package PersonalKata;

import java.util.Scanner;

public class ReversingStrings {
    public static void main(String[] args) {




        Scanner scan = new Scanner(System.in);
        System.out.println("Enter A word: ");
        String userInput = scan.next();
        char [] reverse = userInput.toCharArray();
//        StringBuilder word = new StringBuilder(userInput);
//        System.out.println(word.reverse());

        for (int i = reverse.length -1; i >= 0; i--) {
            System.out.print(reverse[i]);
        }
    }


}
