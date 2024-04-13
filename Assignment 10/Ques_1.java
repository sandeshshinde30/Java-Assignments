/*
    Ques 1 : Write a program to copy contents of one file to another file.
*/

import java.io.*;

public class Ques_1 {
    public static void main(String[] args) {
        String sourceFile = "java.txt"; 
        String destinationFile = "cpp.txt"; 
        
        try {
           
            BufferedReader reader = new BufferedReader(new FileReader(sourceFile));
            
            
            BufferedWriter writer = new BufferedWriter(new FileWriter(destinationFile));
            
            String line;
            while ((line = reader.readLine()) != null) {
                writer.write(line);
                writer.newLine(); 
            }
            
            reader.close();
            writer.close();
            
            System.out.println("File copied successfully.");
        } catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}
