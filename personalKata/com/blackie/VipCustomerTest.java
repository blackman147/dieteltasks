package com.blackie;

public class VipCustomerTest {
    public static void main(String[] args) {
        VipCustomer vipCustomer = new VipCustomer ( "blackie goodman", 100.00, "blackie@gmail.com" );
        System.out.println (vipCustomer.getName () + vipCustomer.getCreditLimit () + vipCustomer.getEmailAddress () );
    }




}
