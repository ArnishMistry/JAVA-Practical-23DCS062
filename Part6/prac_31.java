package Part6;

import java.io.*;

public class prac_31 {

    public static void main(String[] args) {
        characterStreamExample();
        byteStreamExample();

        consoleToFile();
    }

    public static void characterStreamExample() {
        System.out.println("Character Stream Example:");
        try (FileReader fileReader = new FileReader("input.txt");
             FileWriter fileWriter = new FileWriter("output_char_stream.txt")) {
            
            int data;
            while ((data = fileReader.read()) != -1) {
                fileWriter.write(data);  
            }
            System.out.println("Character stream operation complete (input.txt to output_char_stream.txt).");

        } catch (IOException e) {
            System.out.println("Error in character stream example: " + e.getMessage());
        }
    }

    public static void byteStreamExample() {
        System.out.println("Byte Stream Example:");
        try (FileInputStream fileInputStream = new FileInputStream("input.txt");
             FileOutputStream fileOutputStream = new FileOutputStream("output_byte_stream.txt")) {
            
            int data;
            while ((data = fileInputStream.read()) != -1) {
                fileOutputStream.write(data); 
            }
            System.out.println("Byte stream operation complete (input.txt to output_byte_stream.txt).");

        } catch (IOException e) {
            System.out.println("Error in byte stream example: " + e.getMessage());
        }
    }

    public static void consoleToFile() {
        System.out.println("\nEnter text to write into 'console_output.txt'. Type 'exit' to stop:");

        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
             BufferedWriter writer = new BufferedWriter(new FileWriter("console_output.txt"))) {
            
            String line;
            while (!(line = reader.readLine()).equalsIgnoreCase("exit")) {
                writer.write(line);
                writer.newLine();  
            }
            System.out.println("Console input successfully written to 'console_output.txt'.");

        } catch (IOException e) {
            System.out.println("Error in reading/writing console input: " + e.getMessage());
        }
    }
}
