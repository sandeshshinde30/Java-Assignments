/*
    Ques 8 : Write Java Program to display text file information.
*/

import java.io.File;
import java.text.SimpleDateFormat;

public class Ques_8 {
    public static void main(String[] args) {
        

        String filePath = "java.txt"; 

        File file = new File(filePath);

        if (file.exists() && file.isFile()) {
            System.out.println("File Name: " + file.getName());
            System.out.println("File Path: " + file.getAbsolutePath());
            System.out.println("File Size: " + file.length() + " bytes");
            System.out.println("Last Modified: " + formatDate(file.lastModified()));
        } else {
            System.out.println("File does not exist or is not a regular file.");
        }
    }

    private static String formatDate(long timestamp) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        return sdf.format(timestamp);
    }
}
