package Week2;

import java.util.Scanner;
public class Radius 
{
    private static final double PI=3.14159;
    public static void main(String[] args)
    {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter a number for Radius: ");
    double radiusValue = input.nextDouble();
    double area = radiusValue*radiusValue* PI;
    System.out.print("The area for the circle of radius " + radiusValue + " is " + area);
    }
}