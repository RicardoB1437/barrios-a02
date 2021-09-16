import java.util.Scanner;
import java.util.Objects;


/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Ricardo Barrios
 */

public class Solution15
{
    //decide password and store it
    //prompt user for password
    //if password does not equal saved password then dont let in

    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args)
    {
        String knownPass = "Password";

        System.out.println("What is the password? ");
        String userPass = input.nextLine();

        if(Objects.equals(knownPass, userPass)) {
            System.out.println("Welcome!");
        }
        else
            System.out.println("I don't know you.");
    }
}
