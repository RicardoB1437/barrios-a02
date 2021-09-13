import java.util.Scanner;


/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Ricardo Barrios
 */

public class Solution13
{
    //prompt user for P, r, and t
    //use formula A = P(1 + r/n)^(n*t)  to calculate simple interest
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
        double t = input.nextDouble();

        System.out.print("What is the number of times the interest is compounded per year? ");
        int n = input.nextInt();

        double a = Math.pow((1+(r/n)), n*t) *p;

        //needed to print out lone %
        String str = "%";

        System.out.printf("$%d invested at %f%s for %.0f years compounded %d times per year is $%.2f.%n", p, rate, str, t, n, a);
    }
}
