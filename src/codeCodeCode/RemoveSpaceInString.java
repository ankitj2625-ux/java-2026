package codeCodeCode;

public class RemoveSpaceInString {
    public static void main(String[] args) {
        String str = "my  name  is  khan";

        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != ' ') {
                stringBuilder.append(str.charAt(i));
            }
        }
        System.out.println(stringBuilder.toString());

    }
}
