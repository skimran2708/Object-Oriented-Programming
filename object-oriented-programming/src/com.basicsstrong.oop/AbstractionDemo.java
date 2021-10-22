package com.basicsstrong.oop;

import java.util.ArrayList;

interface Mobile
{
    public void calling(String number);
    public void sendMessage(String message);
}

class Apple implements Mobile
{
    private ArrayList<String> contacts =new ArrayList<>();

    public void addContacts(String number)
    {
        contacts.add(number);
    }
    public void calling(String number)
    {
        System.out.println("Calling..."+number);
    }
    public void sendMessage(String message)
    {
        System.out.println("Sending message ..."+message);
    }
}

public class AbstractionDemo {
    public static void main(String[] args) {
        Apple myphone=new Apple();
        myphone.calling("9701209751");
        myphone.sendMessage("hi akhil");
        myphone.addContacts("9247410576");

        Samsung mynewphone=new Samsung();
        mynewphone.addContact("56654546");
        mynewphone.calling("54654645313");
        mynewphone.sendMessage("hi nikhil");
    }
}

abstract class Mobilee
{
    ArrayList<String> list=new ArrayList<>();
    abstract void calling(String number);
    abstract void sendMessage(String message);
    public void addContact(String contact)
    {
        list.add(contact);
    }
}

class Samsung extends Mobilee
{
    public void calling(String number)
    {
        System.out.println("calling from samsung..."+number);
    }
    public void sendMessage(String message)
    {
        System.out.println("Sending message from samsung ..."+message);
    }
}
