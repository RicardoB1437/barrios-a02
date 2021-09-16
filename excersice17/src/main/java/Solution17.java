import java.util.Scanner;

/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Ricardo Barrios
 */

public class Solution17
{
    //prompt user for weight, gender, total alcohol consumed (in ounces),
    // and the amount of time since your last drink
    // use this formula to calculate bac, BAC = (A × 5.14 / W × r) − .015 × H
    // if bac>legalbac then cant drive

    private static final double LEGAL_BAC = 0.08;
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args)
    {
        System.out.print("Enter a 1 is you are male or a 2 if you are female: ");
        String gender = input.nextLine();
        int genderNum = Integer.parseInt(gender);
        double ratio = 0;
        if(genderNum == 1)
        {
            ratio = 0.73;
        }
        else if(genderNum == 2)
        {
            ratio = 0.66;
        }

        System.out.print("How many ounces of alcohol did you have? ");
        String ounces = input.nextLine();
        double ouncesNum = Double.parseDouble(ounces);

        System.out.print("What is your weight, in pounds? ");
        String weight = input.nextLine();
        int weightNum = Integer.parseInt(weight);

        System.out.print("How many hours has it been since your last drink? ");
        String hours = input.nextLine();
        int hoursNum = Integer.parseInt(hours);

        double bac = (ouncesNum * 5.14 / weightNum * ratio) - (.015 * hoursNum);

        System.out.printf("Your BAC is %f%n", bac);
        if(bac<LEGAL_BAC)
        {
            System.out.print("It is legal for you to drive.");
        }
        else
        {
            System.out.print("It is not legal for you to drive.");
        }

    }
}
