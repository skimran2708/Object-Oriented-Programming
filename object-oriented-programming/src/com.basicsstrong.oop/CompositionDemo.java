package com.basicsstrong.oop;

import java.util.*;

class House
{
	private Kitchen kitchen;
	public House()
	{
		kitchen=new Kitchen();
		kitchen.setFood("Pizza");
	}

	public String getFood()
	{
		return Kitchen.getFood();
	}
}

class Kitchen
{
	private String food;
	public void setFood(String food)
	{
		this.food=food;
	}

	public String getFood()
	{
		return this.food;
	}
}

public class CompositionDemo
{
	public static void main(String args[])
	{
		House ob=new House();
		System.out.println(ob.getFood());
	}
}