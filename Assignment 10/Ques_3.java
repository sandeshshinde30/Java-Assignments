/*
    Ques 3 : Develop a program to display contents of file supplied as command line
argument.
*/

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Ques_3 {
    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("Usage: java FileContentDisplay <file-path>");
            return;
        }

        String filePath = args[0]; 
        
        try {
            BufferedReader reader = new BufferedReader(new FileReader(filePath));
            
            String line;
            
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
            
            reader.close();
        } catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}
