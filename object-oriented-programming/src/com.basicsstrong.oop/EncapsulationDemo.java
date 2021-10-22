package com.basicsstrong.oop;

class Account
{
	private double balance;

	public void setBalance(double bal)
	{
		this.balance=bal;
	}

	public int getBalance()
	{
		return this.balance;
	}
}

public class EncapsulationDemo.java
{
	public static void main(String args[])
	{
		Account ob=new Account();
		ob.setBalance(10000);
		System.out.println(getBalance());
	}
}