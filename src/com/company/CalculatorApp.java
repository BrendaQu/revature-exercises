package com.company;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class CalculatorApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter First Number : " );
        String firstNumber = scanner.nextLine();
        int firstnum = Integer.valueOf(firstNumber);
        System.out.println("Enter Second Number : ");
        String secondNumber = scanner.nextLine();
        int secondnum = Integer.valueOf(secondNumber);

      //  System.out.println(firstnum + " " + secondnum);
        System.out.println("Select Option:\n" + "1 - Add\n" + "2 - Subtract\n" + "3 - Multiple\n" + "4 - Divide");
        String option = scanner.nextLine();

        int result = 0;

        switch(option) {
            case "1":
                result = firstnum + secondnum;
                System.out.println("Result: " + firstnum + " + " + secondnum + " = " + result);
                break;
            case "2":
                result = firstnum - secondnum;
                System.out.println("Result: " + firstnum + " - " + secondnum + " = " + result);
                break;
            case "3":
                result = firstnum * secondnum;
                System.out.println("Result: " + firstnum + " * " + secondnum + " = " + result);
                break;
            case "4":
                result = firstnum / secondnum;
                System.out.println("Result: " + firstnum + " / " + secondnum + " = " + result);
                break;
        }

    }

}
