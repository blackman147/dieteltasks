public class ATM {
    public double deposit;

    public double Balance = 10000;

    public void deposit(double depositAmount) {
            Balance = Balance + depositAmount;
    }

    public double getBalance() {
        return Balance;
    }
}
