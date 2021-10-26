package com.company;
//Q4: We have to calculate the percentage of marks obtained in three subjects (each out of 100)
// by student A and in four subjects (each out of 100) by student B. Create an abstract class
// 'Marks' with an abstract method 'getPercentage'. It is inherited by two other classes 'A' and 'B'
// each having a method with the same name which returns the percentage of the students.
// The constructor of student A takes the marks in three subjects as its parameters and the marks
// in four subjects as its parameters for student B. Create an object for eac of the two classes
// and print the percentage of marks for both the students.

abstract class Marks{

    abstract public void getPercentage();
}

class A extends Marks{
    int a;
    int b;
    int c;

    public A(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public void getPercentage() {
        System.out.println((a+b+c)/3+"%");
    }
}

class B extends Marks {
    int a;
    int b;
    int c;
    int d;

    public B(int a, int b, int c, int d) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }

    @Override
    public void getPercentage() {
        System.out.println((a+b+c+d)/4+"%");
    }
}



public class Q4 {
    public static void main(String[] args) {
    A studentA = new A(90,85,88);
    B studentB = new B(90,75,85,95);
    System.out.println("Student A: ");
    studentA.getPercentage();
    System.out.println("Student B: ");
    studentB.getPercentage();
    }
}
