import java.util.Scanner;

/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Ricardo Barrios
 */

public class Solution08
{
    //prompt user for num of pizzas, people, and slices per pizza, read in with standard input
    //print people, pizzas, and total slices
    //print amount of slices per person (must be even) (mod slices by num ppl)
    //print leftovers

    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args)
    {
        System.out.print("How many people? ");
        int people = input.nextInt();

        System.out.print("How many pizzas do you have? ");
        int pizzas = input.nextInt();

        System.out.print("How many slices per pizza? ");
        int slicesPerPizza = input.nextInt();
        int totalSlices = pizzas*slicesPerPizza;

        System.out.printf("%d people with %d pizzas (%d slices)\n", people, pizzas, totalSlices);
        int leftovers = totalSlices % people;

        System.out.printf("Each person gets %d pieces of pizza.\n", (totalSlices-leftovers) / people);
        System.out.printf("There are %d leftover pieces.", leftovers);
    }
}
