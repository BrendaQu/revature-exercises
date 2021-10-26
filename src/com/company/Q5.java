package com.company;
//Q5: Create an abstract class 'Bank' with an abstract method 'getBalance'.
// $100, $150 and $200 are deposited in banks A, B and C respectively.
// 'BankA', 'BankB' and 'BankC' are subclasses of class 'Bank',
// each having a method named 'getBalance'.
// Call this method by creating an object of each of the three classes.
abstract class Bank{
    abstract public void getBalance();
}

class BankA extends Bank{
    int balance = 100;
    @Override
    public void getBalance() {
        System.out.println(balance);
    }
}

class BankB extends Bank{
    int balance = 150;
    @Override
    public void getBalance() {
        System.out.println(balance);
    }
}

class BankC extends Bank {
    int balance = 200;
    @Override
    public void getBalance() {
        System.out.println(balance);
    }
}

public class Q5 {
    public static void main(String[] args) {
    BankA bankA = new BankA();
    BankB bankB = new BankB();
    BankC bankC = new BankC();

    System.out.println("Bank A balance: ");
    bankA.getBalance();
    System.out.println("Bank B balance: ");
    bankB.getBalance();
    System.out.println("Bank C balance: ");
    bankC.getBalance();
    }
}
