package com.basicsstrong.oop;

class Vehicle
{  
  void run()
  {
  	System.out.println("Vehicle is running");
  }  
} 

class Car extends Vehicle
{  
  void run()
  {
  	System.out.println("Car is running");
  }  
}    

class MethodOverriding
{  
	public static void main(String[] args){  
		Vehicle v = new Vehicle();
		v.run();	//Vehicle is running

		Car c = new Car();
		c.run();	//Car is running

		Vehicle v = new Car();
		v.run();	//Car is running

		// Car c = new Vehicle(); // Error
	}
}  