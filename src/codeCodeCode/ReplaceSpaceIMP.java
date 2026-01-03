package codeCodeCode;

public class ReplaceSpaceIMP {
    public static void main(String[] args) {
        String str = "ankit jibha   kate";
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != ' ') {
                sb.append(str.charAt(i));
            }
        }
        System.out.println(sb.toString());
    }
}
