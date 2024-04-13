/*
    Ques 4 : Write Java program to read text from file from a specified index or
skipping byte using FileInputStream.
*/

import java.io.*;

public class Ques_4 {
    public static void main(String[] args) {
       
        if (args.length != 2) {
            System.out.println("Usage: java FileReaderWithOffset <file-path> <offset>");
            return;
        }

        String filePath = args[0]; 
        int offset = Integer.parseInt(args[1]); 

        try {
            FileInputStream inputStream = new FileInputStream(filePath);

            long skipped = inputStream.skip(offset);
            if (skipped != offset) {
                System.out.println("Unable to skip specified offset.");
                return;
            }

            int data;
            while ((data = inputStream.read()) != -1) {
                System.out.print((char) data);
            }

            inputStream.close();
        } catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}
