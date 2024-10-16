import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class prac_40 {
    public static void main(String[] args) {
        // Sample text input
        String text = "this is a sample text this text is a test this is only a test";

        // Call the method to count word occurrences
        Map<String, Integer> wordCountMap = countWordOccurrences(text);

        // Display the words and their occurrences in alphabetical order
        displayWordCount(wordCountMap);
    }

    // Method to count word occurrences using a TreeMap
    public static Map<String, Integer> countWordOccurrences(String text) {
        Map<String, Integer> wordMap = new TreeMap<>(); // TreeMap sorts keys (words) in alphabetical order

        // Split the text into words (assuming words are separated by spaces)
        String[] words = text.split("\\s+");

        // Loop through the words and count occurrences
        for (String word : words) {
            word = word.toLowerCase(); // Convert to lowercase to avoid case-sensitivity issues
            if (wordMap.containsKey(word)) {
                wordMap.put(word, wordMap.get(word) + 1);
            } else {
                wordMap.put(word, 1);
            }
        }

        return wordMap;
    }

    // Method to display the word count map
    public static void displayWordCount(Map<String, Integer> wordMap) {
        Set<Map.Entry<String, Integer>> entrySet = wordMap.entrySet();

        System.out.println("Words and their occurrences in alphabetical order:");
        for (Map.Entry<String, Integer> entry : entrySet) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
