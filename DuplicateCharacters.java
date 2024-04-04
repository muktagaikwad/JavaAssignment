public class DuplicateCharacters {
    
    // Function to find duplicate characters in a string
    public static void findDuplicateCharacters(String str) {
        int[] charCount = new int[256]; // Assuming ASCII characters
        
        // Convert the string to character array
        char[] charArray = str.toCharArray();
        
        // Iterate through each character in the array and count occurrences
        for (char ch : charArray) {
            charCount[ch]++;
        }
        
        // Print duplicate characters
        System.out.println("Duplicate characters in the string:");
        for (int i = 0; i < charCount.length; i++) {
            if (charCount[i] > 1) {
                System.out.println((char) i + ": " + charCount[i] + " times");
            }
        }
    }

    public static void main(String[] args) {
        String input = "programming";
        
        // Find duplicate characters in the input string
        findDuplicateCharacters(input);
    }
}
