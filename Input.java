package Week2;

import java.util.Scanner;

public class Input 
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter three numbers: ");
        double value1 = input.nextDouble();
        double value2 = input.nextDouble();
        double value3 = input.nextDouble();
        double average=(value1+value2+value3)/3;
        System.out.println("The average of " + value1 + " " + value2 + " " + value3 + " is " + average);
    }
}