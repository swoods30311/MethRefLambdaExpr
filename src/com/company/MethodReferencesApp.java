package com.company;

interface Calculator{
    void add(int num, int num2);
}

class Calc{
    public static void addSomething(int num1, int num2) {
        System.out.println(num1+" and "+num2+" addition is: "+(num1+num2));
    }
    public void letsAdd(int num1, int num2) {
        System.out.println(num1+" and "+num2+" add to is: "+(num1+num2));
    }
}
//Functional Interface
interface Messenger{
    Message getMessage(String msg);
        }

class Message{
    Message(String msg){
        System.out.println(">> Message is: "+msg);
    }
}
public class MethodReferencesApp {
    public static void main(String[] args) {
        //Calc.addSomething(10,20);

        //1.Ref to a Static Meth
        //Calculator cRef = Calc::addSomething;// Method ref
        //cRef.add(11,14);

        /*2. Reference to a non static meth or Instance Meth
        Calc calc = new Calc();
        Calculator cRef = calc::letsAdd; // Meth Ref
        cRef.add(12,23);*/

        //3. Ref to a Constructor
        Messenger mRef = Message::new;  // Meth Ref
        mRef.getMessage("Search for the candle rather than cursing the darkness!!");

    }
}
