import java.util.Scanner;

/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Ricardo Barrios
 */


public class Solution09
{
    //prompt for the length and width and read in with standard input
    //create conversion rate for 350 sq feet = 1 gallon
    //if sq ft > gallonrate gallon++

    private static final int GALLON_RATE = 350;
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args)
    {
        System.out.print("Enter the length of ceiling ");
        int length = input.nextInt();

        System.out.print("Enter the width of the ceiling ");
        int width = input.nextInt();

        int squareFeet = width*length;
        int gallons = squareFeet/GALLON_RATE;

        if(squareFeet > gallons*GALLON_RATE)
            gallons++;

        System.out.printf("You will need to purchase %d gallons of paint to cover %d square feet.%n", gallons, squareFeet);
    }

}
