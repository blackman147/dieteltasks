package chapterThree;

import java.util.Scanner;

public class ModifiedAccountTest {
    public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in);
        modifiedAccount blackie = new modifiedAccount("Blackman", 50000);


        System.out.println("Account name is: " + blackie.getAccountName());

        System.out.println( "Enter amount to withdraw: ");
        modifiedAccount.withdraw = userInput.nextDouble();

        System.out.println("account withdrawal successful your balance is: " + blackie.getWithdraw());

    }
}
