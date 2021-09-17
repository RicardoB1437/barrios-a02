import java.util.Scanner;

/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Ricardo Barrios
 */


public class Solution21
{
    /***** this code is so satisfying lol, what we learned in lecture 8 was great *****/
    //prompt user for number 1-12
    //if num isnt 1-12 print Outside range
    //convert number from 1 to 12 to the corresponding month
    //output month

    private static Scanner input = new Scanner(System.in);

    private String monthCalculator(int num)
    {
        switch (num)
        {
            case 1:  return "January";
            case 2:  return "February";
            case 3:  return "March";
            case 4:  return "April";
            case 5:  return "May";
            case 6:  return "June";
            case 7:  return "July";
            case 8:  return "August";
            case 9:  return "September";
            case 10: return "October";
            case 11: return "November";
            case 12: return "December";
            default: return "Invalid month";
        }
    }

    public static void main(String[] args)
    {
        Solution21 sol = new Solution21();

        System.out.print("Please enter the number of the month: ");
        int num = input.nextInt();
        String month = sol.monthCalculator(num);

        System.out.printf("The name of the month is %s.", month);
    }
}
