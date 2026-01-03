package INTERVIEW;

public class AddCharInString {
    public static void main(String[] args) {
        String str = "ankit";

        StringBuilder stringBuilder = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            stringBuilder.append(str.charAt(i));

            if (i < str.length() - 1) {
                stringBuilder.append('-');
            }
        }
        System.out.println(stringBuilder.toString());

    }
}
