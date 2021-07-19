package com.blackie;

import java.util.Scanner;

public class AccountMain {
    public static void main(String[] args) {
       Account account = new Account();
        account.setAccountNumber (12345678);
        account.setCustomerName ("blackie Goodman");
        account.setEmailAddress ("chuksntoka@gmail.com");
        account.setPhoneNumber ("08160528316");

        System.out.println ("your account name is: " +account.getCustomerName());
        System.out.println ("your email address is: " + account.getEmailAddress () );

        Scanner scan = new Scanner (System.in);
        System.out.println ("Enter amount to deposit: ");
        double userInput = scan.nextDouble ( );
        account.deposit (userInput);

        System.out.println ( "Your account balance is " + account.getAccountBalance () );
        System.out.println ("Enter amount to withdraw" );
        double userInput2 = scan.nextDouble ( );
        account.withdraw (userInput2);
        System.out.println ( "Your account balance is " + account.getAccountBalance () );



    }

}
