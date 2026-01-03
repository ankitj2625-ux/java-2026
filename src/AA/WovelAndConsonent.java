package AA;

public class WovelAndConsonent {
    public static void main(String[] args) {
        String str = "usha bhurao jibhakate";
        int consonant = 0;
        int vowel = 0;


        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch >= 'a' && ch <= 'z') {
                if ((ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')) {
                    vowel++;
                } else {
                    consonant++;
                }
            }

        }
        System.out.println("vowel : " + vowel);
        System.out.println("consonant : " + consonant);
    }
}
