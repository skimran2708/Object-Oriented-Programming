package com.basicsstrong.oop;

public class DepartmentDriver {
    public static void main(String[] args) {
        DeptOne  one =new DeptOne();
        int emp=one.getEmployee();
        System.out.println("DeptOne has "+emp+" employees");
        one.attendance();

        //PublicDemo  d= new PublicDemo();
        PublicDemo.displayValue();
    }
}
