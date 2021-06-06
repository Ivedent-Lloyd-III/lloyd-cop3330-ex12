package Base;

/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution 12
 *  Copyright 2021 Ivedent Lloyd III
 */


import java.util.Scanner;

public class Solution {

    static Scanner in = new Scanner(System.in);

    public static void main(String[] args){

        double principal = principalValue();
        double rate = interestRate();
        int years = numberYears();

    }

    private static double principalValue(){

        System.out.print("Enter the principal value: ");
        String principalInput = in.nextLine();
        return Integer.parseInt(principalInput);

    }

    private static double interestRate(){

        System.out.print("Enter the rate of interest: ");
        String interestInput = in.nextLine();
        return Integer.parseInt(interestInput);

    }

    private static int numberYears(){

        System.out.println("Enter the number of years: ");
        String inputYears = in.nextLine();
        return Integer.parseInt(inputYears);

    }



}
