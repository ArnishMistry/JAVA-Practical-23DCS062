import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashSet;
import java.util.Scanner;

public class prac_41 {

    // A HashSet that contains all Java keywords
    private static final HashSet<String> keywords = new HashSet<>();

    static {
        // Java keywords
        String[] keywordArray = {
            "abstract", "assert", "boolean", "break", "byte", "case", "catch", "char", "class", "const", "continue",
            "default", "do", "double", "else", "enum", "extends", "final", "finally", "float", "for", "goto", "if",
            "implements", "import", "instanceof", "int", "interface", "long", "native", "new", "package", "private",
            "protected", "public", "return", "short", "static", "strictfp", "super", "switch", "synchronized", "this",
            "throw", "throws", "transient", "try", "void", "volatile", "while"
        };

        // Add all keywords to the HashSet
        for (String keyword : keywordArray) {
            keywords.add(keyword);
        }
    }

    // Method to count the number of keywords in a Java source file
    public static int countKeywordsInFile(File file) throws FileNotFoundException {
        int keywordCount = 0;

        // Create a Scanner to read the file
        Scanner scanner = new Scanner(file);

        // Read the file line by line
        while (scanner.hasNextLine()) {
            // Split the line into words
            String[] words = scanner.nextLine().split("\\s+");

            // Check each word if it's a keyword
            for (String word : words) {
                // Remove non-alphabetic characters (in case of symbols or punctuation)
                word = word.replaceAll("[^a-zA-Z]", "");

                // If the word is a keyword, increment the count
                if (keywords.contains(word)) {
                    keywordCount++;
                }
            }
        }

        // Close the scanner
        scanner.close();

        return keywordCount;
    }

    public static void main(String[] args) {
        // Provide the path to the Java source file
        File file = new File("path/to/your/JavaSourceFile.java");

        try {
            int keywordCount = countKeywordsInFile(file);
            System.out.println("Number of Java keywords in the file: " + keywordCount);
        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + file.getAbsolutePath());
        }
    }
}
