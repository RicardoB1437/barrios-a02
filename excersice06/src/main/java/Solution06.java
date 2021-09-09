import java.util.Calendar;
import java.util.Scanner;

/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Ricardo Barrios
 */

public class Solution06
{
    //prompt user for current age and read in using standard input
    //prompt user for desired retirement age and read in using standard input
    //output difference between retirement age and current age
    //output retirement year

    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args)
    {
        int currYear = Calendar.getInstance().get(Calendar.YEAR);

        System.out.print("What is your current age? ");
        int currAge = input.nextInt();

        System.out.print("At what age would you like to retire? ");
        int retireAge = input.nextInt();

        System.out.printf("You have %d years left until you can retire.\n", retireAge-currAge);
        System.out.printf("It's %d, so you can retire in %d.", currYear, currYear+(retireAge-currAge));

    }


}
