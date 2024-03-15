/*
    Ques : Write a program in java to handle below exceptions
            a. Divide by Zero
            b. Array Index Out Of Bound
            c. Number Format
            d. Null Pointer
*/

import java.util.Scanner;

public class Ques_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array = {1, 2, 3, 4, 5};
        
        try {
            
            int result = 10 / 0;
        } catch (ArithmeticException e) {
            System.out.println("Error: Division by zero occurred");
        }
        
        try {
            int index = 10;
            int value = array[index];
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Array index out of bounds occurred");
        }
        
        try {

            String str = "abc";
            int number = Integer.parseInt(str);
        } catch (NumberFormatException e) {
            System.out.println("Error: Number format exception occurred");
        }
        
        try {
            String str = null;
            int length = str.length();
        } catch (NullPointerException e) {
            System.out.println("Error: Null pointer exception occurred");
        }
    }
}
