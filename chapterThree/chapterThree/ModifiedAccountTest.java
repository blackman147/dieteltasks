package chapterThree;

import java.util.Scanner;

public class ModifiedAccountTest {
    public static void main(String[] args) {
        double userInput;
        modifiedAccount blackie;
        Scanner userinput = new Scanner(System.in);
         blackie = new modifiedAccount("Blackman", 50000);


        System.out.println("Account name is: " + blackie.getAccountName());

        System.out.println( "Enter amount to withdraw: ");
        modifiedAccount.withdraw = userinput.nextDouble();

        System.out.println("account withdrawal successful your balance is: " + blackie.getWithdraw());

    }
}
