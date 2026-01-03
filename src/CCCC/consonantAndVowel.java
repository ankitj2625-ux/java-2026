package CCCC;

public class consonantAndVowel {
    public static void main(String[] args) {

        String str = "ushabhauraojibhakatekondhakosara";
        int vowel = 0;
        int consonant = 0;
        for (char ch : str.toCharArray()) {
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                vowel++;
            } else {
                consonant++;
            }

        }
        System.out.println(vowel);
        System.out.println(consonant);
    }
}
