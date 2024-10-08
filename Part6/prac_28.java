package Part6;

import java.util.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.FileWriter;

public class prac_28 {
    public static void main(String[] args) {
        int counter = 0;
        String sourcePath = "xanadu.txt";
        try {
            File myFile = new File(sourcePath); 
            if(myFile.createNewFile()) {
                System.out.println("File is created.");
            } else {
                System.out.println("File already exists.");
            }
        } catch(IOException e) {
            System.out.println("ERROR:" + e.getMessage());
        }
        try {
            FileWriter myWriter = new FileWriter(sourcePath);
            myWriter.write("Hello! This is a java programming file!");
            myWriter.close();
        } catch(IOException e) {
            System.out.println("ERROR:" + e.getMessage());
        }
        try {
            File myFile = new File(sourcePath);
            Scanner myReader = new Scanner(myFile);
            char particular = 'a';
            while(myReader.hasNextLine()) {
                String data = myReader.nextLine();
                for(char ch : data.toCharArray()) {
                    if(ch == particular) {
                        counter++;
                    }
                }
            }
            System.out.println("The number of times\'e\' appears in the file is:" + counter);
            myReader.close();
        } catch(FileNotFoundException e) {
            System.out.println("ERROR:" + e.getMessage());
        }
    }
}
