package PersonalKata;

import java.util.Scanner;

public class CreditLimitCalculator {
    public static void main(String[] args) {
        int accountNumber;
        int accountBalance;
        int totalCharges;
        int totalCredits;

        Scanner userInput = new Scanner (System.in);

        System.out.println ("Enter your account number: " );
        accountNumber = userInput.nextInt ();

        System.out.println ("Enter your balance at the beginning of the month" );
        accountBalance = userInput.nextInt ();

        System.out.println ("Enter total of all items charged this month: " );
        totalCharges = userInput.nextInt ();

        System.out.println ("Enter total credits applied for this month: " );
        totalCredits = userInput.nextInt ();

        System.out.println ("Customer's account number is: " + accountNumber );
        System.out.println ("Customer's account balance at the beginning of the month is: " + accountBalance );
        System.out.println ("customer's total charges for the month is: " + totalCharges );
        System.out.println ("Customer's total credits applied for at the end of the month is: " + totalCredits);
        int newBalance = accountBalance + (totalCharges - totalCredits);
        System.out.println ("customer's current account balance is: " + newBalance );

        if (newBalance > totalCredits){
            System.out.println ("credit limit not exceeded" );
        }else
            System.out.println ("credit limit exceeded" );

    }



}
