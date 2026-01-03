package DEMO;

public class VowelAndConsonant {
    public static void main(String[] args) {
        String vc = "ankitbhauraojibhakatekondhakosarabhadarapauni";

        int vowel = 0;
        int consonant = 0;

        for (char ch : vc.toCharArray()) {
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                vowel++;
            } else {
                consonant++;
            }
        }
        System.out.println("vowel : " + vowel);
        System.out.println("consonant : " + consonant);
    }
}
