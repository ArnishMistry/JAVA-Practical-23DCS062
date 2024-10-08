package Part6;

import java.util.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.FileWriter;

public class prac_30 {
    public static void main(String[] args) {
        String sourcePath = "\\Users\\arnish mistry\\OneDrive\\Documents\\Desktop\\Java\\JavaPracticals\\Part6\\prac_30(Source).txt";
        String destinationPath = "\\Users\\arnish mistry\\OneDrive\\Documents\\Desktop\\Java\\JavaPracticals\\Part6\\prac_30(Destination).txt";
        try {
            File myFile1 = new File(sourcePath);
            File myFile2 = new File(destinationPath);
            if (myFile1.createNewFile()) {
                System.out.println("File 1 is created..");
            } else {
                System.out.println("File 1 already exists!!");
            }
            if (myFile2.createNewFile()) {
                System.out.println("File 2 is created..");
            } else {
                System.out.println("File 2 already exists!!");
            }
        } catch (IOException e) {
            System.out.println("ERROR: " + e.getMessage());
        }

        try {
            FileWriter myWriter = new FileWriter(sourcePath);
            myWriter.write("Hii!! My name is Arnish Mistry..\nThis is a test file!\nWelcome to Java programming with files.");
            myWriter.close();
        } catch (IOException e) {
            System.out.println("ERROR: " + e.getMessage());
        }

        try {
            File myFile1 = new File(sourcePath);
            Scanner myReader = new Scanner(myFile1);

            FileWriter myWriter = new FileWriter(destinationPath);
 
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                myWriter.write(data + "\n");
            }
            myReader.close();
            myWriter.close();
        } catch (FileNotFoundException e) {
            System.out.println("ERROR:" + e.getMessage());
        } catch (IOException e) {
            System.out.println("ERROR:" + e.getMessage());
        }
    }
}
