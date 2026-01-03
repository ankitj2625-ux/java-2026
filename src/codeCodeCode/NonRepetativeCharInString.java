package codeCodeCode;

public class NonRepetativeCharInString {
    public static void main(String[] args) {
        String str = "aabbcddex";

        for (char ch : str.toCharArray()) {
            if (str.indexOf(ch) == str.lastIndexOf(ch)) {
                System.out.println("First non-repeating character: " + ch);
                return;
            }
        }

    }
}
