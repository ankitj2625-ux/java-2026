package codeCodeCode;

public class ReverseString {
    public static void main(String[] args) {
        String str = "ankit";
        String revSTring ="";

        for (int i = str.length()-1; i >= 0; i--) {
            revSTring = revSTring + str.charAt(i);
        }
        System.out.println(revSTring);
    }
}
