import java.util.Scanner;

/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Ricardo Barrios
 */


public class Solution07
{
    //prompt user for length of room and read in using standard input
    //prompt user for width of room and read in using standard input
    //output confirmation of length and width
    //out put area in square feet and square meters

    private static final double conversionNum = 0.09290304;
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args)
    {
        System.out.print("What is the length of the room in feet? ");
        int length = input.nextInt();

        System.out.print("What is the width of the room in feet? ");
        int width = input.nextInt();

        int feetSq = length*width;
        double meterSq = feetSq*conversionNum;

        System.out.printf("You entered dimensions of %d feet by %d feet.\n", length, width);
        System.out.println("The area is");
        System.out.printf("%d square feet\n", feetSq);
        System.out.printf("%.3f square meters\n", meterSq);
    }

}
