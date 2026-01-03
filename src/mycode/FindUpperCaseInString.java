package mycode;

public class FindUpperCaseInString {
    public static void main(String[] args) {
        String s = "HelLo wOrlD";

        String emptyString = "";
        for (char c : s.toCharArray()) {
            if (Character.isUpperCase(c)) {
                emptyString += c;
            }
        }
        System.out.println(emptyString);

    }
}
