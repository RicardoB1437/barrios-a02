import java.util.Scanner;

/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Ricardo Barrios
 */

public class Solution12
{
    //prompt user for P, r, and t
    //use formula A = P(1 + rt) to calculate simple interest
    //output new value of money

    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args)
    {
        System.out.print("Enter the principal: ");
        int p = input.nextInt();

        System.out.print("Enter the rate of interest: ");
        double rate = input.nextDouble();
        double r = rate/100;

        System.out.print("Enter the number of years: ");
        int t = input.nextInt();

        double a = p*(1+(r*t));

        System.out.printf("After %d years at %f, the investment will be worth $%.2f.%n", t, rate, a);
    }
}
