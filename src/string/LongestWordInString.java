package string;

public class LongestWordInString {
    public static void main(String[] args) {
        String str = "The quick brown fox jumps over the lazy dog";

        String[] res = str.split("\\s");

        String longestString = "";

        for (String word : res) {
            System.out.println(word.length());
            if (word.length() > longestString.length()) {  // 5 > 0
                longestString = word;
            }
        }
        System.out.println(longestString);
    }
}
