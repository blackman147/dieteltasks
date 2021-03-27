import java.util.Scanner;

public class Factors {
    public static void main(String[] args) {
        int userInput;

        System.out.println( "Enter a number: ");
        Scanner scan = new Scanner(System.in);
        userInput = scan.nextInt();
        System.out.print("Factors of " + userInput + " are: ");

        for (int counter = 1; counter <= userInput; counter++ ){
            if(userInput % counter == 0){
                System.out.print(counter + " ");

            }
        }
    }
}
