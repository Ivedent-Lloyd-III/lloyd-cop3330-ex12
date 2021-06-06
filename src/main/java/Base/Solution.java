package Base;

/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution 12
 *  Copyright 2021 Ivedent Lloyd III
 */


import java.text.DecimalFormat;
import java.util.Scanner;

public class Solution {

    static Scanner in = new Scanner(System.in);

    public static void main(String[] args){

        double principal = principalValue();
        double rate = interestRate();
        int years = numberYears();

        double annualRate = ((principal * (1 + ((rate / 100) * years)))) * 100;

        int roundRate = (int) Math.ceil(annualRate);

        double  rateFinal = roundRate / 100.0;

        System.out.print("After "+years+" years at "+rate+"%, the investment will be worth $");

        DecimalFormat format = new DecimalFormat("0.00");
        System.out.print(format.format(rateFinal));

    }

    private static double principalValue(){

        System.out.print("Enter the principal value: ");
        String principalInput = in.nextLine();
        return Integer.parseInt(principalInput);

    }

    private static double interestRate(){

        System.out.print("Enter the rate of interest: ");
        double interestInput = in.nextDouble();

        return interestInput;

    }

    private static int numberYears(){

        System.out.print("Enter the number of years: ");
        int years = in.nextInt();

        return years;

    }

}
