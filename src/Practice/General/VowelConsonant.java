package Practice.General;

public class VowelConsonant {
    public static void main(String[] args) {
        String str = "ankitjibhakate";
        int vowel = 0;
        int consonant = 0;

        for (char ch : str.toCharArray()) {
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ) {
                vowel++;
            } else {
                consonant++;
            }
        }
        System.out.println(vowel);
        System.out.println(consonant);
    }
}
