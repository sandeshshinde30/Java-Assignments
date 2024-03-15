/*
    Ques : Write a program in java for handling exceptions with nested try block.
*/

public class Ques_4 {
    public static void main(String[] args) {
        try {
            
            int[] numbers = {1, 2, 3};
            int divisor = 0;
            
            try {
                
                for (int i = 0; i <= numbers.length; i++) {
                    System.out.println(numbers[i] / divisor);
                }
            } catch (ArithmeticException e) {
                System.out.println("Inner try block: Division by zero occurred");
            } finally {
                
                System.out.println("Inner finally block executed");
            }
            
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Outer try block: Array index out of bounds occurred");
        } finally {
           
            System.out.println("Outer finally block executed");
        }
        
        System.out.println("Outside try-catch-finally block");
    }
}
