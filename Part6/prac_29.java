package Part6;

import java.util.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.FileWriter;

public class prac_29 {
    public static void main(String[] args) {
        boolean isFound = false;
        String sourcePath = "\\Users\\arnish mistry\\OneDrive\\Documents\\Desktop\\Java\\JavaPracticals\\Part6\\prac_29.txt";
        
        try {
            File myFile = new File(sourcePath);
            if (myFile.createNewFile()) {
                System.out.println("File is created..");
            } else {
                System.out.println("File already exists!!");
            }
        } catch (IOException e) {
            System.out.println("ERROR: " + e.getMessage());
        }

        try {
            FileWriter myWriter = new FileWriter(sourcePath);
            myWriter.write("Hii!! My name is Arnish Mistry..");
            myWriter.close();
        } catch (IOException e) {
            System.out.println("ERROR: " + e.getMessage());
        }

        try {
            File myFile = new File(sourcePath);
            Scanner myReader = new Scanner(myFile);
            String word = "Hii";  

            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                
                for (int i = 0; i <= data.length() - word.length(); i++) {
                    if (data.substring(i, i + word.length()).equals(word)) {
                        isFound = true;  
                        break;  
                    }
                }
                
                if (isFound) {
                    break; 
                }
            }

            if (isFound) {
                System.out.println("The word is found.");
            } else {
                System.out.println("Word not found.");
            }
            
            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("ERROR: " + e.getMessage());
        }
    }
}
