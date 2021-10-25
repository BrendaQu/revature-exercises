package com.company;

import java.util.Scanner;

public class CalculatorEMI {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input: ");
        System.out.println("Loan Amount: ");
        String loanStr = scanner.nextLine();
        System.out.println("Rate of Interest: ");
        String rateStr = scanner.nextLine();
        System.out.println("Tenure: ");
        String tenureStr = scanner.nextLine();

        int P = Integer.valueOf(loanStr);
        float r = Float.parseFloat(rateStr);
        int n = Integer.valueOf(tenureStr);

        double result = P*r*(Math.pow(1+r,n))/((Math.pow(1+r,n)-1));

        System.out.println("Output: ");
        System.out.println("EMI: " + result);



    }
}
