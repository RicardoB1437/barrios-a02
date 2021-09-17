import java.util.Scanner;

/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Ricardo Barrios
 */

public class Solution23
{
    //

    private static Scanner input = new Scanner(System.in);

    private String decisionTree()
    {
        String response;
        System.out.print("Is the car silent when you turn the key? ");
        response = input.nextLine();
        if(response.equals("y"))
        {
            System.out.print("Are the battery terminals corroded? ");
            response = input.nextLine();
            if(response.equals("y"))
            {
                return "Clean terminals and try starting again.";
            }
            else
            {
                return "Replace cables and try again.";
            }
        }
        else
        {
            System.out.print("Does the car make a slicking noise? ");
            response = input.nextLine();
            if(response.equals("y"))
            {
                return "Replace the battery.";
            }
            else
            {
                System.out.print("Does the car crank up but fail to start? ");
                response = input.nextLine();
                if(response.equals("y"))
                {
                    return "Check spark plug connections.";
                }
                else
                {
                    System.out.print("Does the engine start and then die? ");
                    response = input.nextLine();
                    if(response.equals("y"))
                    {
                        System.out.print("Does you car have fuel injection? ");
                        response = input.nextLine();
                        if(response.equals("y"))
                        {
                            return "Get it in for service";
                        }
                        else
                        {
                            return "Check to ensure the choke is opening and closing.";
                        }
                    }
                }
            }
        }
        return "This should not be possible.";
    }

    public static void main(String[] args)
    {
        Solution23 sol = new Solution23();
        String output = sol.decisionTree();

        System.out.printf("%s", output);
    }
}