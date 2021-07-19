package Personalkata;

import java.util.Scanner;

public class ModifiedAccountTest {
    public static void main(String[] args) {
        ModifiedAccount account = new ModifiedAccount ();
        Scanner scan = new Scanner (System.in);
        System.out.println ("Enter deposit amount" );
        double userInput = scan.nextDouble ();
        System.out.println ("your account balance is: " + account.deposit (userInput));

        System.out.println ("Enter amount to withdraw: " );
        double withdrawalAmount = scan.nextDouble ();
        System.out.println ("your account balance is: "  + account.Withdraw (withdrawalAmount));
    }
}
