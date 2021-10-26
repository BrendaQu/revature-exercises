package com.company;

//Q2: Take name, roll number and field of interest from user and print in the format below :
//     Hey, my name is xyz and my roll number is xyz. My field of interest are xyz.

import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter name: ");
        String name = scanner.nextLine();
        System.out.println("Please enter roll number: ");
        int rollNumber = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Please enter field of interests: ");
        String interest = scanner.nextLine();

        System.out.println("Hey, my name is " + name + " and my roll number is " + rollNumber + ". My field of interest is " + interest + ".");
    }
}
