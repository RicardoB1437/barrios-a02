import java.util.Scanner;
import java.util.Objects;

/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Ricardo Barrios
 */

public class Solution18
{
    //prompt user for c or f
    //use conversion equation to convert from c to f or vice versa
    //C = (F − 32) × 5 / 9
    //F = (C × 9 / 5) + 32
    //output new temp

    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args)
    {
        System.out.print("Your choice: ");
        String choice = input.nextLine();
        double conversion = 0;

        if(Objects.equals(choice, "c") || Objects.equals(choice, "C"))
        {
            System.out.print("Please enter the temperature in Fahrenheit: ");
            double temp = input.nextDouble();
            conversion = (temp - 32) * 5 / 9;
            System.out.printf("The temperature in Celsius is %.2f.", conversion);
        }
        else if(Objects.equals(choice, "f") || Objects.equals(choice, "F"))
        {
            System.out.print("Please enter the temperature in Celsius: ");
            double temp = input.nextDouble();
            conversion = (temp * 9 / 5) + 32;
            System.out.printf("The temperature in Fahrenheit is %.2f.", conversion);
        }
    }
}
