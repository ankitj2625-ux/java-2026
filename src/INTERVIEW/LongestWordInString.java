package INTERVIEW;

public class LongestWordInString {
    public static void main(String[] args) {

        String str = " i am ankit jibhakate";
//        System.out.println(str.length());

        String[] res = str.split("\\s");
//        System.out.println(res.length);

        String longestString = "";

        for (String word : res) {

            if (word.length() > longestString.length()) {
                longestString = word;
            }
        }
        System.out.println(longestString);

    }
}
