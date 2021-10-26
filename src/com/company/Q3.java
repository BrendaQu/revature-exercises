package com.company;
//Q3: Print the average of three numbers entered by user by creating a class named 'Average' having a method to calculate and print the average.

import java.security.spec.RSAOtherPrimeInfo;
import java.util.Scanner;

class Average {
    double a;
    double b;
    double c;

    public Average(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public void calculate(){
        double area = (a + b + c)/3;
        System.out.println("The average is: " + area);
    }
}

public class Q3 {
    public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter first number");
    double firstNum = scanner.nextDouble();
    System.out.println("Enter second number");
    double secondNum = scanner.nextDouble();
    System.out.println("Enter third number");
    double thirdNum = scanner.nextDouble();
    Average avg = new Average(firstNum,secondNum,thirdNum);
    avg.calculate();
    }
}
