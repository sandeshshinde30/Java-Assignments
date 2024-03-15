/*
    Ques : Write a program in java to handle custom exception with single try block and multiple catch block.
*/

class CustomException extends Exception {
    public CustomException(String message) {
        super(message);
    }
}

public class Ques_2 {
    public static void main(String[] args) {
        try {
            int[] array = {1, 2, 3, 4, 5};
         
            int result = 10 / 0; // ArithmeticException
            int index = 10;
            int value = array[index]; // ArrayIndexOutOfBoundsException
            String str = "abc";
            int number = Integer.parseInt(str); // NumberFormatException
            String nullStr = null;
            int length = nullStr.length(); // NullPointerException
            
            
            if (value < 0) {
                throw new CustomException("Negative value not allowed");
            }
        } catch (ArithmeticException e) {
            System.out.println("Error: Division by zero occurred");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Array index out of bounds occurred");
        } catch (NumberFormatException e) {
            System.out.println("Error: Number format exception occurred");
        } catch (NullPointerException e) {
            System.out.println("Error: Null pointer exception occurred");
        } catch (CustomException e) {
            System.out.println("Custom Error: " + e.getMessage());
        }
    }
}
