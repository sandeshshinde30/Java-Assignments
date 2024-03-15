/*
    Ques : Write a program in java for handling checked exceptions using throws keyword.
*/

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Ques_8 {
    public static void main(String[] args) {
        try {
            readFile("nonexistent_file.txt");
        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + e.getMessage());
        }
    }

    public static void readFile(String fileName) throws FileNotFoundException {
        File file = new File(fileName);
        
        Scanner scanner = new Scanner(file);
        while (scanner.hasNextLine()) {
            System.out.println(scanner.nextLine());
        }
        scanner.close();
    }
}
