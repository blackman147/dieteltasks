

public class AutomatedAcc {

    private String name;
    private double balance;
    private int pin = 1234;
    double getDeposit;



    public AutomatedAcc(String name, double balance, int pin) {
        this.name = name;
        this.balance =balance;
        this.pin = pin;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public int getPin(int userPin) {
        return pin;
    }

    public void setPin(int pin) {
        if (pin == 1234){
            System.out.println("pin correct");
        }
        else{
            System.out.println("invalid pin try again");

        }

        this.pin = pin;
    }

    public void setWithdraw(double withdraw){

        if (withdraw > balance){
            System.out.println("insufficient funds!!");
        }
        else
            if (withdraw < balance){
                System.out.println("withdrawal successful");
            }
            balance -= withdraw;

    }

    public double getWithdraw() {
        return balance;
    }

    public double getDeposit() {

        return getDeposit;
    }

    public void setDeposit(double deposit) {
        if (deposit > balance){
            balance += deposit;
            System.out.println("Your account has been credited");
        }

    }

    public double getTransfer(double amountTransfered) {
        return balance;
    }

    public void setTransfer(double transfer) {
        if (transfer > balance){
            System.out.println("insufficient funds!!");
        }
        else
        if (transfer < balance){
            System.out.println("Transfer successful");
        }
        balance -= transfer;

    }


}
