package com.basicsstrong.oop;

class A
{

}

class B extends class A  //Single Inherirence
{

}

class C extends class B  //Multilevel Inheritence
{

}

Interface AA
{
	default void print(){}
}

Interface BB
{
	default void print(){}
}

class D implements AA,BB  //Mutiple Inheritence
{
	public void method(){
	{
		AA.super.print();
		BB.super.print();
	}
}


class E extends class A{}
class F extends class A{}  // Hierarchial Inheritence

//Hybrid is not supported as mutiple+multilevel