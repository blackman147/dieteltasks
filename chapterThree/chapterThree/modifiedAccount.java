package chapterThree;

public class modifiedAccount {
    public static double withdraw;
    private String accountName;
    private double accountBalance;




    public modifiedAccount( String accountName1, double accountBalance1) {


        this.accountName = accountName1;
        this.accountBalance = accountBalance1;
    }


    public String getAccountName(String accountName) {
        return accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    public double getAccountBalance() {
        return accountBalance;
    }

    public void setAccountBalance(double accountBalance) {
        this.accountBalance = accountBalance;
    }

    public void setWithdraw(double withdraw) {
        this.withdraw = withdraw;
    }

    public double getWithdraw() {
        if (withdraw > accountBalance){
            System.out.println("withdrawal amount exceed account balance");
        }
        else
            if (withdraw < accountBalance){
                accountBalance -= withdraw;
            }
        return accountBalance;
    }


    public String getAccountName() {
        return accountName;
    }
}
