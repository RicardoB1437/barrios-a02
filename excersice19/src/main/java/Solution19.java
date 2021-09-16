import java.util.Scanner;

/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Ricardo Barrios
 */

public class Solution19
{
    //prompt user for height in inches and weight in pounds
    //use following equation to calculate bmi
    //bmi = (weight / (height × height)) * 703
    //if > print under if in range print healthy if < print over

    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args)
    {
        double weightNum = 0;
        double heightNum = 0;
        Boolean flag = true;
        while(flag)
        {
            try
            {
                System.out.print("Enter weight in pounds: ");
                String weight = input.nextLine();
                weightNum = Double.parseDouble(weight);

                System.out.print("Enter height in inches: ");
                String height = input.nextLine();
                heightNum = Double.parseDouble(height);
                flag = false;
            }
            catch (Exception e)
            {
                System.out.println("that was not a number, try again");
            }
        }

        double bmi = (weightNum / (heightNum * heightNum)) * 703;

        String str = "You are within the ideal weight range.";
        if(bmi>25)
        {
            str = "You are overweight. You should see your doctor.";
        }
        else if(bmi<18.5)
        {
            str = "You are underweight. You should see your doctor.";
        }
        System.out.printf("Your BMI is %.2f.%n", bmi);
        System.out.printf("%s", str);
    }
}
