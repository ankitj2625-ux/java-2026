package A_Learning;

public class LongestWordString {
    public static void main(String[] args) {
        String str = " i am ankit";
        String[] stringChar = str.split("\\s");

        String longestWord = "";

        for (String val : stringChar) {
            if (val.length() > longestWord.length()) {
                longestWord = val;
            }
        }
        System.out.println(longestWord);
    }
}
