package Part6;

import java.util.Scanner;
import java.io.File;
import java.io.IOException;
import java.io.FileWriter;
import java.io.FileNotFoundException;

public class fileHandling {
    public static void main(String[] args) {
        int lineCount = 0;
        try {
            File myobj = new File("example1.txt");
            if(myobj.createNewFile()) {
                System.out.println("File created.." + myobj.getName());
            } else {
                System.out.println("File already exists..");
            }
        } catch(IOException e) {
            System.out.println("ERROR:" + e.getMessage());
        }
        try {
            FileWriter myWriter = new FileWriter("example.txt");
            myWriter.write("Files is Java can be tricky to learn, but they are fun!!\nThis is a new line...");
            myWriter.close();
        } catch(IOException e) {
            System.out.println("ERROR:" + e.getMessage());
        }
        try {
            File myObj = new File("example.txt");
            Scanner myReader = new Scanner(myObj);
            while(myReader.hasNextLine()) {
                String data = myReader.nextLine();
                System.out.println(data);
                lineCount++;
            }
            System.out.println("Total characters in the file are:" + myObj.length());
            System.out.println("Total number of lines in the file are: " + lineCount);
            if (myObj.exists()) {
                System.out.println("File name: " + myObj.getName());
                System.out.println("Absolute path: " + myObj.getAbsolutePath());
                System.out.println("Writeable: " + myObj.canWrite());
                System.out.println("Readable " + myObj.canRead());
                System.out.println("File size in bytes " + myObj.length());
              } else {
                System.out.println("The file does not exist.");
              }
            myReader.close();
            if(myObj.delete()) {
                System.out.println("The file has been deleted :3");
            } else {
                System.out.println("Failed to delete the file :(");
            }
        } catch(FileNotFoundException e) {
            System.out.println("ERROR:" + e.getMessage());
        }
    }
}
