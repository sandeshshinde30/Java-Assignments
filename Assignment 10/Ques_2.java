/*
    Ques 2 : Write a program to write bytes to a file.
*/

import java.io.FileOutputStream;
import java.io.IOException;

public class Ques_2 {
    public static void main(String[] args) {
        String filename = "byteFile.bin"; 
        
        try {
            FileOutputStream outputStream = new FileOutputStream(filename);
            
            byte[] bytesToWrite = {65, 66, 67, 68, 69}; 
            
            outputStream.write(bytesToWrite);
            
            outputStream.close();
            
            System.out.println("Bytes written to file successfully.");
        } catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}
