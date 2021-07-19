package com.blackie;

public class Account {
    private int accountNumber;
    private double accountBalance;
    private String customerName;
    private String emailAddress;
    private String phoneNumber;


    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getAccountBalance() {
        return accountBalance;
    }

    public void setAccountBalance(double accountBalance) {

        this.accountBalance = accountBalance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public double deposit(double depositAmount){
        if(depositAmount > 0){
            accountBalance += depositAmount;
        }
        return accountBalance;
    }

    public double withdraw( double withdrawalAmount){
        if (withdrawalAmount > 0 && withdrawalAmount <= accountBalance){
            accountBalance-=withdrawalAmount;
        }else
            System.out.println ("Invalid deposit amount" );

        return accountBalance;
    }


}
