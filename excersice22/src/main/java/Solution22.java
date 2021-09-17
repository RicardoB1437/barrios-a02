import java.util.Scanner;

/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Ricardo Barrios
 */

public class Solution22
{
    //prompt user for three numbers.
    // Check first to see that all numbers are different.
    // If they’re not different, then exit the program.
    // Otherwise, display the largest number of the three.

    private static Scanner input = new Scanner(System.in);

    private int readNumbers(String prompt)
    {
        System.out.print(prompt);
        return input.nextInt();
    }

    private int findMax(int num1, int num2, int num3)
    {
        if(num1 > num2 && num1 > num3)
        {
            return num1;
        }
        if(num2 > num1 && num2 > num3)
        {
            return num2;
        }
        return num3;
    }

    public static void main(String[] args)
    {
        Solution22 sol = new Solution22();
        int num1 = sol.readNumbers("Enter number 1: ");
        int num2 = sol.readNumbers("Enter number 2: ");
        int num3 = sol.readNumbers("Enter number 3: ");

        if(num1 == num2 && num1 == num3)
        {
            return;
        }

        int max = sol.findMax(num1, num2, num3);
        System.out.printf("The largest number is %d", max);
    }
}
