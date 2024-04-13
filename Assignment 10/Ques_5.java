/*
    Ques 5 : Write Java program to append text/string in a file.
*/

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Ques_5 {
    public static void main(String[] args) {
        if (args.length != 2) {
            System.out.println("Usage: java Ques_5 <file-path> <text-to-append>");
            return;
        }

        String filePath = args[0]; 
        String textToAppend = args[1]; 

        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(filePath, true));

            writer.write(textToAppend);

            writer.close();

            System.out.println("Text appended to file successfully.");
        } catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}
