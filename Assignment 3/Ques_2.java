/*
    Ques : Display all your information (prn, name, age, address, class) on console
            without creating any object and writing any code in main method.
 */

public class Ques_2 {
   
    private static String prn = "1234567890";
    private static String name = "John Doe";
    private static int age = 20;
    private static String address = "123 Main Street, City, Country";
    private static String className = "Class 10";

    
    static {
        System.out.println("PRN: " + prn);
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Address: " + address);
        System.out.println("Class: " + className);
    }

    public static void main(String args[])
    {

    }
}
