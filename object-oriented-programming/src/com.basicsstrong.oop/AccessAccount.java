package com.basicsstrong.oop;


class BankAccount
{
    private  double balance = 1000000;
    private String username = "basicsstrong";
    private String password = "password";

    public double getWalletBalance(String username,String password)
    {
        if(this.username.equals(username) && this.password.equals(password))
        {
            return this.balance;
        }
        else
            return 0.0;
    }
}

public class AccessAccount {
    public static void main(String[] args) {
        BankAccount acc=new BankAccount();
        System.out.println(acc.getWalletBalance("basicsstrong", "password"));
    }    
}
