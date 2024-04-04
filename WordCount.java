import java.util.HashMap;
import java.util.Map;

public class WordCount {
    
    // Function to count the number of words in a string using HashMap
    public static Map<String, Integer> countWords(String input) {
        // Split the input string into words using whitespace as delimiter
        String[] words = input.split("\\s+");
        
        // Create a HashMap to store word counts
        Map<String, Integer> wordCountMap = new HashMap<>();
        
        // Iterate through each word
        for (String word : words) {
            // Remove any non-alphabetic characters from the word
            word = word.replaceAll("[^a-zA-Z]", "").toLowerCase();
            
            // Update the count for the current word
            wordCountMap.put(word, wordCountMap.getOrDefault(word, 0) + 1);
        }
        
        return wordCountMap;
    }

    public static void main(String[] args) {
        // Input string
        String input = "Hello!This is a Java Program to count the number of words in a string using HashMap";
        
        // Count the number of words in the input string
        Map<String, Integer> wordCountMap = countWords(input);
        
        // Print the word counts
        System.out.println("Word Counts is given sentence:");
        for (Map.Entry<String, Integer> entry : wordCountMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
