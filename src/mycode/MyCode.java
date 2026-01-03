package mycode;

public class MyCode {
    public static void main(String[] args) {
        String str = "ankitjibhalate";

        int vowelCount = 0;

        char[] ch = str.toCharArray();
        for (Character c : ch) {
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' ||
                    c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U')

                vowelCount++;
        }
        System.out.println(vowelCount);
    }
}
