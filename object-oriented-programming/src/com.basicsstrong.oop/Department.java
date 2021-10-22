package com.basicsstrong.oop;

public abstract class Department {
    public abstract int getEmployee();

    public abstract void method();

    public void attendance()
    {
        System.out.println("I am present");
    }
}

class DeptOne extends Department
{
    public int getEmployee()
    {
        return 100;
    }

    public void method()
    {
        System.out.println("This is implementation of method");
    }

    public void attendance()
    {
        System.out.println("yes...I am present");
    }
}
