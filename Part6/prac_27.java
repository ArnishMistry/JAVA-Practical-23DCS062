package Part6;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class prac_27 {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Please specify at least one file.");
            return;
        }

        for (String fileName : args) {
            File file = new File(fileName);
            int lineCount = 0;

            try (Scanner scanner = new Scanner(file)) {
                while (scanner.hasNextLine()) {
                    scanner.nextLine();
                    lineCount++;
                }
                System.out.println("File: " + fileName + " - Lines: " + lineCount);
            } catch (FileNotFoundException e) {
                System.out.println("ERROR: File not found - " + fileName);
            } catch (Exception e) {
                System.out.println("ERROR: An error occurred while reading " + fileName + " - " + e.getMessage());
            }
        }
    }
}
