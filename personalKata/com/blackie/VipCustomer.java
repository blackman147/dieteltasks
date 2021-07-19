package com.blackie;

public class VipCustomer {
    private String name;
    private double creditLimit;
    private String emailAddress;


    public VipCustomer(){
        this("blackie goodman",100.00, "blackie@gmail.com" );
    }

    public VipCustomer(String name, double creditLimit){
        this.name = name;
        this.creditLimit = creditLimit;
    }

    public VipCustomer(String name, double creditLimit, String emailAddress){
        this(name, creditLimit);
        this.emailAddress = emailAddress;
    }

    public String getName() {
        return name;
    }

    public double getCreditLimit() {
        return creditLimit;
    }

    public String getEmailAddress() {
        return emailAddress;
    }
}
