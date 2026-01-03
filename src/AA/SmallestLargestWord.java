package AA;

public class SmallestLargestWord {
    public static void main(String[] args) {
        String sentence = "i am ankit jibhakate";

        // Split the sentence into words using spaces as delimiters
        String[] words = sentence.split(" ");

        // Initialize variables to store the largest and smallest words
        String smallest = words[0];
        String largest = words[0];

        // Loop through each word in the array
        for (String word : words) {
            if (word.length() < smallest.length()) {
                smallest = word;
            }
            if (word.length() > largest.length()) {
                largest = word;
            }
        }

        // Output the results
        System.out.println("Smallest word: " + smallest);
        System.out.println("Largest word: " + largest);
    }
}
