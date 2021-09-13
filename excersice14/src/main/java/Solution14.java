import java.util.Objects;
import java.util.Scanner;

/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Ricardo Barrios
 */

public class Solution14
{
    //prompt user for order amount and state
    //if state = WI then the tax is invoked (.055)
    //output subtotal and total

    private static final double TAX_RATE = 0.055;
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args)
    {
        System.out.print("What is the order amount? ");
        double amount = input.nextDouble();

        input.nextLine();
        System.out.print("What is the state? ");
        String state = input.nextLine();

        double total;
        double tax;
        if(Objects.equals("WI", state))
        {
            tax = amount * TAX_RATE;
            total = amount + tax;
        }
        else
        {
            total = amount;
            tax = 0;
        }

        System.out.printf("The subtotal is $%.2f.", amount);
        System.out.printf("The tax is $%.2f.", tax);
        System.out.printf("The total is $%.2f.", total);
    }
}
