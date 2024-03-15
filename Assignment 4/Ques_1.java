/*
    Ques : Write a program to calculate area and volume of sphere using static
    variable and method create two static methods for area and volume
    calculation. (insert data from user).
 */

import java.util.Scanner;

public class Ques_1 {

    private static final double PI = 3.14159265359;

    public static double calArea(double radius) {
        return 4 * PI * radius * radius;
    }

    public static double calVolume(double radius) {
        return (4.0 / 3.0) * PI * radius * radius * radius;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the radius of the sphere: ");
        double radius = scanner.nextDouble();

        double area = calArea(radius);
        double volume = calVolume(radius);

        System.out.println("Area of the sphere: " + area);
        System.out.println("Volume of the sphere: " + volume);

        scanner.close();
    }
}
