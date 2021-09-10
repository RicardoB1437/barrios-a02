import java.util.Scanner;

/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Ricardo Barrios
 */

public class Solution11
{
    //prompt user for num of euros and exchange rate
    //use formula to acquire num of us dollars from conversion
    //print us dollars

    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args)
    {
        System.out.print("How many euros are you exchanging? ");
        int currFrom = input.nextInt();

        System.out.print("What is the exchange rate? ");
        double rate = input.nextDouble();

        double currTo = rate*currFrom;
        System.out.printf("%d euros at an exchange rate of %.4f is%n", currFrom, rate);
        System.out.printf("%.2f U.S. dollars.", currTo);

    }
}
