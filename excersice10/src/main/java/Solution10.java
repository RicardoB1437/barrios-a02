import java.util.Scanner;

/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Ricardo Barrios
 */

public class Solution10
{
    //pass in all inputs as strings because i think thats what the assignment says
    //convert them to ints because necessary
    //do math on ints
    //build strings using string inputs
    //output built strings

    private static Scanner input = new Scanner(System.in);
    private static final double TAX_RATE = 0.055;

    public static void main(String[] args)
    {
        System.out.print("Enter the price of item 1: ");
        String p1 = input.nextLine();
        System.out.print("Enter the quantity of item 1: ");
        String q1 = input.nextLine();
        System.out.print("Enter the price of item 2: ");
        String p2 = input.nextLine();
        System.out.print("Enter the quantity of item 2: ");
        String q2 = input.nextLine();
        System.out.print("Enter the price of item 3: ");
        String p3 = input.nextLine();
        System.out.print("Enter the quantity of item 3: ");
        String q3 = input.nextLine();

        int price1 = Integer.parseInt(p1);
        int quantity1 = Integer.parseInt(q1);
        int price2 = Integer.parseInt(p2);
        int quantity2 = Integer.parseInt(q2);
        int price3 = Integer.parseInt(p3);
        int quantity3 = Integer.parseInt(q3);

        double subTotal = (price1*quantity1)+(price2*quantity2)+(price3*quantity3);
        double tax = subTotal*TAX_RATE;
        double total = subTotal+tax;

        System.out.printf("Subtotal: $%.2f%n", subTotal);
        System.out.printf("Tax: $%.2f%n", tax);
        System.out.printf("Total: $%.2f%n", total);

    }
}
