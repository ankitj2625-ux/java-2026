package codeCodeCode;

public class vowelAndConsonant {
    public static void main(String[] args) {
        String str = "ankitjibhakate";
        int vowel = 0;
        int consonant = 0;

        //        str.toLowerCase();
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
