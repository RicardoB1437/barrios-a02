import java.util.Scanner;
import java.util.Objects;

/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Ricardo Barrios
 */


public class Solution20
{
    //prompt user for amount
    //prompt user for state
    //if wisconsin prompt for county
    //For Eau Claire county residents, add an additional 0.005 tax.
    //For Dunn county residents, add an additional 0.004 tax.
    //if illinois 0.08 tax
    //else no tax
    //output tax and total

    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args)
    {
        System.out.print("What is the order amount? ");
        double amount = input.nextDouble();
        input.nextLine();

        System.out.print("What state do you live in? ");
        String state = input.nextLine();

        double tax = 0;

        if(Objects.equals(state, "Wisconsin"))
        {
            tax = 0.05;
            System.out.print("What county do you live in? ");
            String county = input.nextLine();
            if(Objects.equals(county, "Dunn"))
            {
                tax+=.004;
            }
            else if(Objects.equals(county, "Eau Claire"))
            {
                tax+=.005;
            }
        }
        if(Objects.equals(state, "Illinois"))
        {
            tax = 0.08;
        }
        double taxAmount = amount*tax;
        double total = amount + taxAmount;
        System.out.printf("The tax is $%.2f.%nThe total is $%.2f", taxAmount, total);

    }
}
