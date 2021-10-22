package com.basicsstrong.practise;

import com.basicsstrong.oop.AbstractDemo;
import com.basicsstrong.oop.PublicDemo;

public class Test extends PublicDemo {
    public static void main(String[] args) {
        Test demo= new Test();
        demo.method();
        AbstractDemo d=new AbstractDemo();
    }
}
