package Personalkata;

public class ModifiedAccount {
    private String accountName;
    private double withdraw;
    private double deposit;
    private double balance;

    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    public double Withdraw(double withdrawalAmount) {
        if (withdrawalAmount <= 0){
            System.out.println ("invalid withdrawal amount entered please enter another amount" );
        }else if (withdrawalAmount > balance){
            System.out.println ("insufficient funds!!!!" );
        }
        balance -= withdrawalAmount;

        return balance;
    }

    public double deposit(double depositAmount) {
        if (depositAmount <= 0){
            System.out.println ("invalid deposit amount" );
        }else{
            balance += depositAmount;
        }
        return balance;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }


}
