/*
    Ques : Write a program in java to show the use of finally keyword.
*/

public class Ques_3 {
    public static void main(String[] args) {
        try {
            System.out.println("Inside try block");
            int result = 10 / 2;
            System.out.println("Result: " + result);
        } finally {
            System.out.println("Inside finally block");
        }
        System.out.println("Outside try-finally block");
    }
}
