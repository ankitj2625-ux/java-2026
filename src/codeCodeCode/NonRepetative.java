package codeCodeCode;

public class NonRepetative {
    public static void main(String[] args) {
        String s = "stress";
        for (Character ch : s.toCharArray()) {
            if (s.indexOf(ch) == s.lastIndexOf(ch)) {
                System.out.println("First non repeat character = " + ch);
                return;
                // break;
            }
        }
    }

}

