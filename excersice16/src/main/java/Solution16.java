import java.util.Scanner;

/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Ricardo Barrios
 */

public class Solution16
{
    //prompt user for age
    //compare age to (known) driving age
    //output legality of driving compared to that age

    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args)
    {
        int drivingAge = 16;

        System.out.print("What is your age? ");
        int age = input.nextInt();

        String str = (drivingAge<=age) ? "You are old enough to legally drive." : "You are not old enough to legally drive.";
        System.out.printf("%s", str);
    }
}
