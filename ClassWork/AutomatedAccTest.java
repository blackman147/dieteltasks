
import java.util.Scanner;

public class AutomatedAccTest {

    public static void main(String[] args) {
        AutomatedAcc blackie = new AutomatedAcc("Chibuzor E.", 0.0, 1234 );
        Scanner scan = new Scanner(System.in);
        System.out.println("Welcome " + blackie.getName());

        String prompt = """
                    -> press 1 to deposit
                    -> press 2 for withdrawal
                    -> press 3 for transfer
                    -> press 4 to check balance
                    -> press 0 to exit.
                    """;



        int userInput = 5;

        while(userInput != 0){
            System.out.println("Enter your pin: ");
            int userPin = scan.nextInt();
            blackie.setPin(userPin);
            System.out.println(prompt);
            System.out.println("Enter a number from 1 - 4 or 0 to exit");
             userInput = scan.nextInt();

            switch (userInput) {
                case 1:
                    System.out.println("Enter deposit amount: ");
                    double amountDeposited = scan.nextDouble();
                    blackie.setDeposit(amountDeposited);
                    break;
                case 2:
                    System.out.println("Enter amount to withdraw: ");
                    double amountWithdrawn = scan.nextDouble();
                    blackie.setWithdraw(amountWithdrawn);
                    break;
                case 3:
                    System.out.println("Enter amount to transfer: ");
                    double amountTransfer = scan.nextDouble();
                    System.out.println("Enter account number of recipient: ");
                    long accountNumber = scan.nextLong();
                    if (accountNumber < 10000000000L && accountNumber > 999999999L) {
                        double userAccountNumber = scan.nextDouble();

                        blackie.setTransfer(amountTransfer);
                        blackie.setTransfer(userAccountNumber);
                    }
                    break;
                case 4:
                    System.out.println("Your account balance is: " + blackie.getBalance());
                    break;
                default:
                    System.out.println("Thank you for banking with us.");

                    }

            }
        }


    }

