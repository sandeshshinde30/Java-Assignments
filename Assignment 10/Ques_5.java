/*
    Ques 5 : Write Java program to append text/string in a file.
*/

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Ques_5 {
    public static void main(String[] args) {
       
        String filePath = "./append.txt"; 
        String textToAppend = "append.txt"; 

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
