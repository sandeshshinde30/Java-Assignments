/*
    Ques 6 : Write Java program to read a file line by line.
*/

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Ques_6 {
    public static void main(String[] args) {
        
        String filePath = "java.txt"; 
        
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
