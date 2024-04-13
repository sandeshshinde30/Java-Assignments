/*
    Ques 7 : Write Java program to delete a file.
*/

import java.io.File;

public class Ques_7 {
    public static void main(String[] args) {
    
        String filePath = "cpp.txt"; 
        
        File file = new File(filePath);
        
        if (file.exists()) {
            if (file.delete()) {
                System.out.println("File deleted successfully.");
            } else {
                System.out.println("Failed to delete the file.");
            }
        } else {
            System.out.println("File does not exist.");
        }
    }
}
