/*
    Ques : Write a program using final variable to check speed limit exceeds or not
            on highway. If speed is greater than 100. Then generate alert message.
 */

import java.util.Scanner;

public class Ques_4 {
    
    private final static int MAX_SPEED_LIMIT = 100;
    static int speed;
    static Scanner in = new Scanner(System.in); 

    public void getSpeed() 
    {
        System.out.print("Enter Speed : ");
        speed = in.nextInt();
    }

    public static void checkSpeed(int speed) {
        if (speed > MAX_SPEED_LIMIT) {
            System.out.println("Alert: Speed limit exceeded! Your speed is " + speed + " km/h, which exceeds the maximum limit of " + MAX_SPEED_LIMIT + " km/h.");
        } else {
            System.out.println("Your speed is within the limit.");
        }
    }

    public static void main(String[] args) {
        Ques_4 obj = new Ques_4(); 
        obj.getSpeed();
        checkSpeed(speed); 
    }
}
