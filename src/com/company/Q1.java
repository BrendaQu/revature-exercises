package com.company;
//Q1: Ask user to give two double input for length and breadth of a rectangle and print area type casted to int.
import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter length of rectangle (double type): ");
        double length = scanner.nextDouble();
        System.out.println("Please enter breadth of rectangle (double type): ");
        double breadth = scanner.nextDouble();

        double area = length * breadth;
        System.out.println("Area: " + (int) area);

    }
}
