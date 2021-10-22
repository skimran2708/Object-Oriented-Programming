package com.basicsstrong.oop;

class Fan
{
    public boolean isOn;
    public static int staticVar;

    Fan(boolean a)
    {
        this.isOn=a;
    }

    public void turnOn()
    {
        int var=0;
        isOn=true;
        System.out.println("Fan is spinning");
    }

    public void turnOff()
    {
        isOn=false;
        System.out.println("Fan is stopped");
    }

}

class Addition
{
    private static int val=0;
    public int findSum(int a,int b)
    {
        int sum=0;
        sum=a+b;
        return sum;
    }
    public static int get()
    {
        return val;
    }
}
public class demo
{
    public static void main(String[] args) {
        Fan myfan=new Fan(true);
        myfan.turnOn();
        myfan.turnOff();
        Fan yourfan=new Fan(false);
        yourfan.isOn=true;
        Fan.staticVar=4;
        Addition performsum=new Addition();
        int sum=performsum.findSum(10, 18);
        System.out.println("Sum is : "+sum);
        int getTheVal=Addition.get();
        System.out.println("Get the val is "+getTheVal);
    }
}