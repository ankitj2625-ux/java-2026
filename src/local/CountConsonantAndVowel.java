package local;

public class CountConsonantAndVowel {
    public static void main(String[] args) {

        String str = "ankitbhauraojibhakateushajibhakateankitankitankit";
        char[] ch = str.toCharArray();
        int vowel = 0;
        int consonant = 0;

        for (char c : ch) {
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                vowel++;
            } else {
                consonant++;
            }
        }
        System.out.println(vowel);
        System.out.println(consonant);
    }
}
