package DEMO;

public class FirstNonRepetativeChar {
    public static void main(String[] args) {
        String str = "ankitjibhakate";

        for (char ch : str.toCharArray()) {
            if (str.indexOf(ch) == str.lastIndexOf(ch)) {
                System.out.println("first Non Repetative Char in String : " + ch);
                return;
            }
        }
    }
}
